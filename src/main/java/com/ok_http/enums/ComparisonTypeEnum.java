package com.ok_http.enums;

public enum ComparisonTypeEnum {
    EQUAL(0, "Equal"),
    NOT_EQUAL(1, "Not Equal"),
    LESS_THAN(2, "Less Than"),
    LESS_THAN_OR_EQUAL(3, "Less Than or Equal"),
    GREATER_THAN(4, "Greater Than"),
    GREATER_THAN_OR_EQUAL(5, "Greater Than or Equal"),
    EXISTS(6, "Exists");

    private final int code;
    private final String value;

    ComparisonTypeEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    public static String getValueByCode(int code) {
        for (ComparisonTypeEnum type : ComparisonTypeEnum.values()) {
            if (type.getCode() == code) {
                return type.getValue();
            }
        }
        return null;
    }
}
