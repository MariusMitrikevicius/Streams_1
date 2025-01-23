package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
        public static void main(String[] args) {


            List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "grapes");
            System.out.println("Words list: " + words);
            System.out.println("Žodžiai ilgesni nei 5r.:");
            for (String word : words) {
                if (word.length() > 5) {
                    System.out.println(word);
                }
            }
            System.out.println();
            List<String> longWords = words.stream()
                    .filter(word -> word.length() > 5)
                    .toList();
            System.out.println("Žodžiai ilgesni nei 5r. " + longWords);
            System.out.println();





            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
            int sum = 0;
            for (Integer number : numbers) {
                sum += number;
            }
            System.out.println("Skaičių suma: " + sum);
            System.out.println();
            int sum1 = numbers.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            System.out.println("Skaičių suma: : " + sum1);










        }
}