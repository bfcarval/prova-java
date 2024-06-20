package br.com.confidencecambio.javabasico.util;

import org.springframework.util.ObjectUtils;

public final class ValidateUtil {

    public static boolean validateValue(final String value) {
        return ObjectUtils.isEmpty(value);
    }

    public static boolean validateEmptySpace(final String value) {
        return Character.isWhitespace(value.charAt(0)) ||
                Character.isWhitespace(value.charAt(value.length() - 1));
    }
}