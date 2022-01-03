package com.hatcattt.exercism.utils;

/**
 * Abstract class allowing to represent an Exercism.
 */
public abstract class Exercism {
    private final String name;
    private final Difficulty difficulty;

    /**
     * Create a new Exercism and set a difficulty.
     * @param difficulty difficulty
     */
    protected Exercism(Difficulty difficulty) {
        this.name = this.getClass().getSimpleName();
        this.difficulty = difficulty;
    }

    /**
     * Output some exemples of the solution.
     */
    public abstract void displayExemples();

    @Override
    public String toString() {
        return  "Name       : " + name +
                "\nDifficulty : " + difficulty.name();
    }
}
