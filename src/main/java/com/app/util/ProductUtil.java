package com.app.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProductUtil {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    public static String formatTimestamp(LocalDateTime dateTime) {
        return dateTime.format(FORMATTER);
    }

    public static LocalDateTime parseTimestamp(String timestamp) {
        return LocalDateTime.parse(timestamp, FORMATTER);
    }
}