package com.hatcattt.exercism;

import com.hatcattt.exercism.puzzles.*;
import com.hatcattt.exercism.utils.Exercism;

import java.util.ArrayList;
import java.util.List;

/**
 * Run All the puzzles and display some exemples;
 */
public class RunExercismPuzzles {
    public static void main(String[] args) {
        List<Exercism> exercismList = new ArrayList<>() {{

            add(new Twofer());
            add(new HandshakeCalculator());
            add(new AnnalynInfiltration());

        }};

        System.out.println("( Total of Exercism complete: " + exercismList.size() + " )");
        for (var exercism : exercismList) {

            System.out.println("__________________________________");
            System.out.println(exercism);
            System.out.println("----------------------------------");
            exercism.displayExemples();
        }
    }
}
