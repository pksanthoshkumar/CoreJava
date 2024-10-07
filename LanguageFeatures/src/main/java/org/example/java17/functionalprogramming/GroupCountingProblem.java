package org.example.java17.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupCountingProblem {

    /*
    Problem: You are given a list of sentences, where each sentence contains multiple words separated by spaces.
    Your task is to write a function using MapReduce that performs the following operations:

    Map: Extract all the unique words from each sentence and normalize them (i.e., convert to lowercase).

    Reduce: Count how many sentences each word appears in (this is NOT the total word count but the count of unique
    sentences containing the word).

    Additional Requirement: After the aggregation, return only the words that appear in more than one sentence,
    sorted in descending order by the number of sentences they appear in.
     */
    public static void main(String[] args) {

        List<String> sentences = List.of("The quick brown fox",
                "Jumped over the lazy dog",
                "The quick blue fox",
                "The dog was not lazy") ;


        System.out.println(getWordCount (sentences));

    }

    static Map <String, Long> getWordCount(List<String> sentence) {
        return sentence.stream().map(s-> s.toLowerCase()).map (
                s-> {
                    return Arrays.stream(s.split("\\s+")).toList();
                }
        ).flatMap(s-> s.stream()).collect(Collectors.groupingBy(s-> s, Collectors.counting()));
    }

}
