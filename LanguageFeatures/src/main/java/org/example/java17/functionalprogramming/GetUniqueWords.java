package org.example.java17.functionalprogramming;

import java.util.*;
import java.util.stream.Collectors;

public class GetUniqueWords {
    /*
    You are given a list of sentences. Your task is to:

    Extract all the individual words from the sentences.
    Convert the words to lowercase.
    Filter out words that are less than or equal to 3 characters.
    Remove duplicate words.
    Return the list of unique words sorted alphabetically.
         */
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Java is fun",
                "I love programming in Java",
                "Programming is a great skill to learn",
                "Learning Java is fun"
        );

        GetUniqueWords words = new GetUniqueWords ();
        System.out.println(words.getUniqueWords (sentences));
    }


    public Set<String> getUniqueWords (List<String> words) {
       Set<String> unWords =  words.stream().flatMap(s-> Arrays.stream(s.split("\\s+")))
                .map(w-> w.toLowerCase()).filter(word->word.length() >= 3).collect(Collectors.toSet());

        TreeSet <String> sortedSet = new TreeSet<>(Comparator.reverseOrder());
        sortedSet.addAll(unWords);
        return sortedSet;
    }
}
