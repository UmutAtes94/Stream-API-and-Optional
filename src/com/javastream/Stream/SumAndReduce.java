package com.javastream.Stream;

import java.util.List;

public class SumAndReduce {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        Integer sumOfNumbers = calculateWithStream(numbers);
        System.out.println(sumOfNumbers);
    }

    //FOR
    public static int calculateWithFor(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static int calculateWithStream(List<Integer> numbers){
        return numbers.stream()
                .reduce(Integer::sum)
                .orElse(0);
    }

}
