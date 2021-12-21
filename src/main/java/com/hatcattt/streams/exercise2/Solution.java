package com.hatcattt.streams.exercise2;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int count = getTotalNumberOfLettersOfNamesLongerThanFive("william", "jones", "aaron", "seppe", "frank", "gilliam");
        System.out.println(count); // 14

        int count2 = getTotalNumberOfLettersOfNamesLongerThanFive("will");
        System.out.println(count2); // 0
    }

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names)
                .filter(E -> E.length() > 5)
                .mapToInt(String::length)
                .sum();
    }
}
