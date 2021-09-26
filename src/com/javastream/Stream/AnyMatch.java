package com.javastream.Stream;

import java.util.List;

public class AnyMatch {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(4, 15, 14, 11, 22);

        //anyMatch
        boolean anyMatch = numbers.stream()
                .anyMatch(number -> number == 14);
        System.out.println(anyMatch);
        //OUTPUT: true

        //findAny
        Integer findAnyNumber = numbers.stream()
                .filter(number -> number > 14)
                .findAny()
                .orElse(0);
        System.out.println(findAnyNumber);
        //OUTPUT: 15

        //findFirst()
        Integer findFirst = numbers.stream()
                .filter(number -> number > 15)
                .findFirst()
                .orElse(0);
        System.out.println(findFirst);
        //OUTPUT: 22
    }
}
