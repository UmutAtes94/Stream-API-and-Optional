package com.javastream.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLifeCycle {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ahmet",12, "TUR"));
        personList.add(new Person("Umut", 27, "GER"));
        personList.add(new Person("Ronaldo", 37, "POR"));

       List<Person> childList = personList.stream()   //List<Person> personList => Stream<Person>
                .filter(person -> person.getAge() < 18) // filtered Stream<Person>
                .collect(Collectors.toList());          // Stream<Person> => List<Person>

    }
}
