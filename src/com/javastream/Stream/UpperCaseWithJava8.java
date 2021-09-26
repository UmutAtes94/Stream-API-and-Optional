package com.javastream.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseWithJava8 {

    public static void main(String[] args) {
        List<String> names = List.of("apple", "orange", "melon");
        List<String> upperNames = mapToUppercaseWithStream(names);
        System.out.println(upperNames);

    }

    //FOR
    public static List<String> mapToUppercaseWithFor(List<String> names) {
        List<String> uppercaseNames = new ArrayList<>();
        for(String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }

    //STREAM
    public static List<String> mapToUppercaseWithStream(List<String> names) {
        return names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
    }
}