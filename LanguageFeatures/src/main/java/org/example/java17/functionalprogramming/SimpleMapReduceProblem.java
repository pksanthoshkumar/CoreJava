package org.example.java17.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class SimpleMapReduceProblem {
    public static void main(String[] args) {
        /*
        Find the length of all words:
        "apple", "banana", "cherry", "date"
         */

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        int wordsLength = words.stream().map(w-> w.length()).reduce(0, (total, aLength)-> total  + aLength);

        System.out.println(wordsLength);

    }
}
