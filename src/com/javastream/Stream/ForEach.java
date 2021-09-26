package com.javastream.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(5, 12, 55, 23, 44);
        //1.
        numberList.stream()
                .filter(number -> number > 20)
                .forEach(System.out::println);
        //OUTPUT: 55 23 44

        //veya
        numberList.stream()
                .filter(number -> number > 20)
                .forEach(number -> {
                    if (number > 20){
                        System.out.println(number);
                    }
                });
        //OUTPUT: 55 23 44
    }
}
