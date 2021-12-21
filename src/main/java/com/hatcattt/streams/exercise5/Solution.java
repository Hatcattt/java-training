package com.hatcattt.streams.exercise5;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

        // 1)
        List<String> finalList = list.stream()
                .map(str -> str.substring(0, 1).toUpperCase() + str.substring(str.length() - 1))
                .toList();

        System.out.println("With Stream API:\n" + finalList);

        // 2)
        StringBuilder finalString = new StringBuilder();
        list.forEach(str -> finalString
                .append(str.toUpperCase().charAt(0))
                .append(str.charAt(str.length() - 1))
        );
        System.out.println("\nWith StringBuilder:\n" + finalString);
    }
}
