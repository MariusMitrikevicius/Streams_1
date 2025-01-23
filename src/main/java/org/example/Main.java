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

        }
}