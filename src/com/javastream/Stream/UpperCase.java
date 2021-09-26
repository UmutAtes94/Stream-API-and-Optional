package com.javastream.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

//String listesi olarak aldığı elemanları upperCase yapıp yeni bir listede dönme
public class UpperCase {

    public static void main(String[] args) {

    }

    //FOR
    public static Collection<String> mapToUppercaseWithFor(String... names) {
        Collection<String> uppercaseNames = new ArrayList<>();
        for(String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }

    //STREAM
    public static Collection<String> mapToUppercaseWithStream(String... names) {
        return Arrays.stream(names)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }


}
