package com.ok_http.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {
    public static long parseDateToMiliseconds(String dateString, String pattern) {
        try {
            SimpleDateFormat dateFormatter = new SimpleDateFormat(pattern);
            Date date = dateFormatter.parse(dateString);
            return date.getTime();
        } catch (ParseException p) {
            p.printStackTrace();
            return 0;
        }

    }

    public static Date parse(String dateString, String pattern) throws ParseException {
        try {
            SimpleDateFormat dateFormatter = new SimpleDateFormat(pattern);
            Date date = dateFormatter.parse(dateString);
            return date;
        } catch (ParseException p) {
            p.printStackTrace();
            return null;
        }
    }

}
