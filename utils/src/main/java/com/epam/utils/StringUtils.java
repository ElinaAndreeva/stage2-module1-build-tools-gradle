package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return NumberUtils.isParsable(str) && Double.parseDouble(str) > 0;
    }
}
