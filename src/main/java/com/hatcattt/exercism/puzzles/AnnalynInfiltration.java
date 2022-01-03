package com.hatcattt.exercism.puzzles;

import com.hatcattt.exercism.utils.Difficulty;
import com.hatcattt.exercism.utils.Exercism;

/**
 * Annalyn's Infiltration exercise for Exercism.org.
 */
public class AnnalynInfiltration extends Exercism {

    public AnnalynInfiltration() {
        super(Difficulty.EASY);
    }

    /**
     * Check if a fast attack can be made.
     */
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    /**
     * Check if the group can be spied upon.
     */
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return (knightIsAwake || archerIsAwake || prisonerIsAwake);
    }

    /**
     * Check if the prisoner can be signalled.
     */
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return (!archerIsAwake && prisonerIsAwake);
    }

    /**
     * Check if the prisoner can be freed.
     */
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (petDogIsPresent) ? !archerIsAwake : (prisonerIsAwake && !knightIsAwake && !archerIsAwake);
    }

    /**
     * Output some exemples of the solution.
     */
    @Override
    public void displayExemples() {
        System.out.println(canFastAttack(false));
        System.out.println(canSpy(true, false, true));
        System.out.println(canSignalPrisoner(true, true));
        System.out.println(canFreePrisoner(false, true, false, true));
    }
}
