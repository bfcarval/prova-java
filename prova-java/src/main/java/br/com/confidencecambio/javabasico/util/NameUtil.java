package br.com.confidencecambio.javabasico.util;

import java.util.Arrays;

public final class NameUtil {

    private static final String WHITE_SPACE = " ";

    public static String getFirstName(final String name) {
        return name.split(WHITE_SPACE)[0];
    }

    public static String getMiddleAndLastName(final String name) {
        final var valueSplit = name.split(WHITE_SPACE) ;

        valueSplit[0] = "";

        final var stb = new StringBuilder();

        Arrays.stream(valueSplit).forEach( p -> {
            stb.append(p);
            stb.append(WHITE_SPACE);
        });

        return stb.toString().trim();
    }

    public static String abbreviateName(final String name) {
        final var stb = new StringBuilder();
        final var firstName = getFirstName(name);
        var middleName = getMiddleAndLastName(name).split(WHITE_SPACE);

        middleName[0] = middleName[0].substring(0, 1).concat(".");

        stb.append(firstName).append(WHITE_SPACE);

        Arrays.stream(middleName).forEach( p -> stb.append(p).append(WHITE_SPACE));

        return stb.toString().trim();
    }
}