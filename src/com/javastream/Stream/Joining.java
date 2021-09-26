package com.javastream.Stream;

import java.util.List;
import java.util.stream.Collectors;

public class Joining {

    //FOR
    public static String namesToString(List<Person> people) {
        String label = "Names: ";
        StringBuilder sb = new StringBuilder(label);
        for (Person person : people) {
            if (sb.length() > label.length()) {
                sb.append(", ");
            }
            sb.append(person.getName());
        }
        sb.append(".");
        return sb.toString();
    }


    //STREAM
    public static String namesToStringWithStream(List<Person> people){
        return "Names: " +
                people.stream()
                .map(Person::getName)
                .collect(Collectors.joining(", ")) + ".";
    }


}
