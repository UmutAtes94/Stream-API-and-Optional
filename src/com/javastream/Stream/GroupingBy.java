package com.javastream.Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

    //FOR
    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        Map<Boolean, List<Person>> map = new HashMap<>();
        map.put(true, new ArrayList<>());
        map.put(false, new ArrayList<>());
        for (Person person : people) {
            map.get(person.getAge() >= 18).add(person);
        }
        return map;
    }

    //STREAM
    public static Map<Boolean, List<Person>> partitionAdultsWithStream(List<Person> people) {
        return people.stream()
                 .collect(Collectors.groupingBy(person -> person.getAge()>18, Collectors.toList()));
    }

    // ***********************************************************************************


    //FOR
    public static Map<String, List<Person>> groupByNationality(List<Person> people) {
        Map<String, List<Person>> map = new HashMap<>();
        for (Person person : people) {
            if (!map.containsKey(person.getNationality())) {
                map.put(person.getNationality(), new ArrayList<>());
            }
            map.get(person.getNationality()).add(person);
        }
        return map;
    }

    //STREAM
    public static Map<String, List<Person>> groupByNationalityWithStream(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(Person::getNationality, Collectors.toList()));
    }
}
