package com.hatcattt.streams.exercise3;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        var listePrenoms = new ArrayList<String>() {{
            add("Maxence");
            add("Joan");
            add("Justine");
            add("André");
            add("Martin");
            add("Jennifer");
        }};

        var listePrenomsEnMaj = listePrenoms.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Liste initiale :");
        System.out.println(listePrenoms);

        System.out.println("\nNouvelle liste :");
        System.out.println(listePrenomsEnMaj);
    }
}
