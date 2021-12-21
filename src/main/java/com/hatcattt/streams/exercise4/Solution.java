package com.hatcattt.streams.exercise4;

public class Solution {
    public static void main(String[] args) {
        String chaine = "Combien ai-je de caractères, avec et sans espaces et combien d'espaces ?";

        int nombreCaractere = nombreDeCaractere(chaine);
        int nombreCaractereSansEspace = nombreDeCaractereSansEspace(chaine);
        int nombreEspaces = nombreEspaces(chaine);

        System.out.println(chaine);
        System.out.println("Votre chaine contient :");
        System.out.printf("%d caractères avec espaces\n%d caractères sans espaces\n%d espaces"
                , nombreCaractere
                , nombreCaractereSansEspace
                , nombreEspaces);
    }

    static int nombreDeCaractere(String str) {
        return (int) str.chars().count();
    }

    static int nombreDeCaractereSansEspace(String str) {
        return (int) str.chars().filter(s -> s != ' ').count();
    }

    static int nombreEspaces(String str) {
        return (int) str.chars().filter(s -> s == ' ').count();
    }
}
