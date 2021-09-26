package com.javastream.Stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UnderAge {


    //FOR
    public static Set<String> getKidNamesWithFor(List<Person> people) {
        Set<String> kids = new HashSet<>();
        for (Person person : people) {
            if (person.getAge() < 18) {
                kids.add(person.getName());
            }
        }
        return kids;
    }

    //STREAM
    public static Set<String> getKidNamesWithStream(List<Person> people) {
        return people.stream()
                .filter(person -> person.getAge() < 18) //Stream<Person>
                .map(Person::getName)                   //Stream<String> => "onur", "umut", "onur"
                .collect(Collectors.toSet());           //Set<String> => "onur", "umut"
    }
}
