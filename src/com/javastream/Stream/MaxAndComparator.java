package com.javastream.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxAndComparator {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ahmet", 12, "TUR"));
        personList.add(new Person("Alex", 42, "BR"));
        personList.add(new Person("Crespo", 46, "ARG"));
        Person oldestPerson = getOldestPersonWithStream(personList);
        System.out.println("oldest person: " + oldestPerson.getName());
    }


    //FOR
    public static Person getOldestPersonWithFor(List<Person> people) {
        Person oldestPerson = new Person("", 0);
        for (Person person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }


    //STREAM
    public static Person getOldestPersonWithStream(List<Person> people) {
        return people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElse(null);
    }
}
