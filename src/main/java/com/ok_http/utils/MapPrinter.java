package com.ok_http.utils;

import java.util.Map;
import java.util.Map.Entry;

public class MapPrinter {
        public static <T> void printMap(Map<T, Object> map) {
        for (Entry<T, Object> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
