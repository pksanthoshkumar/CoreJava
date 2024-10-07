package org.example.java17.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class MapReduceToFIndLongestString {
    public static void main(String[] args) {

        /*  Find the longest String :  */

        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        System.out.println(getLongestString (strings));
    }

    static String getLongestString(List<String> strings) {
        String longestString = strings.stream().reduce("", (accumulator, aString) ->
                accumulator.length() < aString.length()? aString : accumulator);

        return longestString;
    }
}
