package com.javastream.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    //Person listesindeki elemanları yaşları küçükten büyüğe olacak şekilde yeni listede sırala
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ahmet",33, "TUR"));
        personList.add(new Person("Umut", 17, "GER"));
        personList.add(new Person("Ronaldo", 11, "POR"));

        List<Person> personListSortedByAge = personList.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());

        personListSortedByAge.forEach(person-> System.out.println(person.getName()));
        //OUTPUT: Ronaldo Umut Ahmet
    }
}
