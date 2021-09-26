package com.javastream.Stream;

import java.util.List;

public class LetterCount {
    public static void main(String[] args) {
        List<String> names = List.of("emre", "ibrahim", "mehmet");
        int sum = getTotalNumberOfLettersOfNamesLongerThanFiveWithStream(names);
        System.out.println(sum);
    }

    //Liste elemanlarını al => stream()
    //5' ten uzun isimleri filtrele => filter()
    //Geri kalan listedeki tum harflerin sayisini integer'a çevir => mapToInt()
    //Harf sayılarını topla => sum()

    //** FOR **
    public static int getTotalNumberOfLettersOfNamesLongerThanFiveWithFor(List<String> names) {
        int sum = 0;
        for (String name : names) {
            if (name.length() > 5) {
                sum += name.length();
            }
        }
        return sum;
    }

    //** STREAM **
    public static int getTotalNumberOfLettersOfNamesLongerThanFiveWithStream(List<String> names){
        return names.stream()
                .filter(name -> name.length() > 5)
                .mapToInt(String::length)
                .sum();
    }
}
