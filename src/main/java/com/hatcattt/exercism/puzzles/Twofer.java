package com.hatcattt.exercism.puzzles;

import com.hatcattt.exercism.utils.Difficulty;
import com.hatcattt.exercism.utils.Exercism;

/**
 * Twofer String exercise for exercism.org.
 */
public class Twofer extends Exercism {

    public Twofer() {
        super(Difficulty.EASY);
    }

    /**
     * Main methode : return a string representing a twofer.
     * @param name name to implement
     * @return String : a sentence
     */
    public String twofer(String name) {

        // using ternary operator
        return (name == null) ? "One for you, one for me." : "One for " + name + ", one for me.";
    }

    @Override
    public void displayExemples() {
        System.out.println(this.twofer("Peter"));
        System.out.println(this.twofer(""));
    }
}