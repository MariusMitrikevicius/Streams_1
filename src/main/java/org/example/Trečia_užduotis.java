package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Trečia_užduotis {
    public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "grapes");



        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Uppercase words: " + upperCaseWords);




        List<String> uppercaseWords = new ArrayList<>();
        for (String word : words) {
            uppercaseWords.add(word.toUpperCase());
        }
        System.out.println("Uppercase words: " + upperCaseWords);


    }


}
