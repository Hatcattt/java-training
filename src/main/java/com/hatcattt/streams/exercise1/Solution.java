package com.hatcattt.streams.exercise1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        String lettre = "j".toUpperCase();
        var listePrenoms = new ArrayList<String>() {{
            add("Maxence");
            add("Joan");
            add("Justine");
            add("André");
            add("Martin");
            add("Jennifer");
        }};

        int nombre = (int) listePrenoms.stream()
                .filter(E -> E.startsWith(lettre))
                .count();

        System.out.printf("Il y a %d prénoms qui commencent par la lettre %s dans votre liste :\n", nombre, lettre.toUpperCase());

        var listePrenom2 = listePrenoms.stream()
                .filter(E -> E.startsWith(lettre))
                .sorted()
                .collect(Collectors.toList());

        listePrenom2.forEach(System.out::println);
    }
}
