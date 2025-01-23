package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ketvirta_Užduotis {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "avocado", "orange", "kiwi", "grapes", "apricots");

        String result = words.stream()
                .filter(word -> word.startsWith("a"))
                .collect(Collectors.joining(", "));
        System.out.println("Words starting with 'a': " + result);




        StringBuilder result1 = new StringBuilder();
        for (String word : words) {
            if (word.startsWith("a")) {
                if (!result1.isEmpty()) {
                    result1.append(", ");
                }
                result1.append(word);
            }
        }
        System.out.println(result1.toString());
    }
}
