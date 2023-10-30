package com.ok_http.utils;

import java.lang.reflect.Field;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonCompareUtil {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void compareObjectsWithJson(Object javaObject, String jsonFilePath) {
        try {
            // Đọc dữ liệu từ file JSON
            Map<String, Object> jsonData = objectMapper.readValue(JsonUtil.read(jsonFilePath), Map.class);

            // Lấy tất cả các trường (fields) của đối tượng Java
            Field[] fields = javaObject.getClass().getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);

                // Lấy tên JSON property từ annotation hoặc tên trường nếu không có
                String propertyName = getJsonPropertyName(field);

                // Lấy giá trị của trường trong đối tượng Java
                Object javaValue = field.get(javaObject);

                Object jsonValue = jsonData.get(propertyName);
                boolean isEqual = javaValue.equals(jsonValue);
                String trueString = "-------------------------------------------------" + "\n"
                        + "Field: " + field.getName() + "\n"
                        + "JSON Property: " + propertyName + "\n"
                        + "Object Value: " + javaValue + "\n"
                        + "Roochart Value: " + jsonValue + "\n"
                        + "Equal: " + isEqual;

                String falseString = "-------------------------------------------------" + "\n"
                        + "Field: " + field.getName() + "\n"
                        + "JSON Property: " + propertyName + "\n"
                        + "Object Value: " + javaValue + "\n"
                        + "Roochart Value: (Not Found), Equal: false";
                // Kiểm tra xem có giá trị tương ứng trong JSON không
                if (jsonData.containsKey(propertyName)) {
                    System.out.println(trueString);
                } else {
                    System.out.println(falseString);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getJsonPropertyName(Field field) {
        JsonProperty jsonPropertyAnnotation = field.getAnnotation(JsonProperty.class);
        if (jsonPropertyAnnotation != null && !jsonPropertyAnnotation.value().isEmpty()) {
            return jsonPropertyAnnotation.value();
        } else {
            return null;
        }
    }
}
