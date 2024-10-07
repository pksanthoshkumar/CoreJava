package org.example.java17.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class MapReduceToConcatenateStrings {
    /*
    "Hello", "world", "from", "MapReduce"

    Use map reduce to concatenate
     */

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "world", "from", "MapReduce");
        String longString = strings.stream().reduce("", (a, b)-> a + " - " + b);

        System.out.println(longString);
    }
}
