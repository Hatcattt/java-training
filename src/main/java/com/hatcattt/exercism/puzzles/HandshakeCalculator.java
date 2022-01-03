package com.hatcattt.exercism.puzzles;

import com.hatcattt.exercism.utils.Difficulty;
import com.hatcattt.exercism.utils.Exercism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

enum Signal {
    WINK, DOUBLE_BLINK, CLOSE_YOUR_EYES, JUMP
}

/**
 * Hand shake calculator exercise for exercism.org.
 */
public class HandshakeCalculator extends Exercism {

    public HandshakeCalculator() {
        super(Difficulty.EASY);
    }

    /**
     * Calculate a handshake : Function for Exercism.org
     * @param number number to send
     * @return List<Signal> : secret handshake
     */
    public List<Signal> calculateHandshake(int number) {
        List<Signal> signalList = new ArrayList<>();

        String binary = Integer.toBinaryString(number);
        int len = binary.length() - 1;

        try {
            if (binary.charAt(len) == '1') { signalList.add(Signal.WINK); }
            if (binary.charAt(len - 1) == '1') { signalList.add(Signal.DOUBLE_BLINK); }
            if (binary.charAt(len - 2) == '1') { signalList.add(Signal.CLOSE_YOUR_EYES); }
            if (binary.charAt(len - 3) == '1') { signalList.add(Signal.JUMP); }
            if (binary.charAt(len - 4) == '1') { Collections.reverse(signalList); }
        } catch (StringIndexOutOfBoundsException ignored) {}

        return signalList;
    }

    /**
     * Methode from Exercism.org (Han-Seung-Hee)
     */
    List<Signal> calculateHandshake2(int number) {
            List<Signal> actions = new ArrayList<>();
            if(( number & 1) != 0) {actions.add(Signal.WINK);}
            if(( number & 1 << 1 ) != 0) {actions.add(Signal.DOUBLE_BLINK);}
            if(( number & 1 << 2 ) != 0) {actions.add(Signal.CLOSE_YOUR_EYES);}
            if(( number & 1 << 3 ) != 0) {actions.add(Signal.JUMP);}
            if(( number & 1 << 4 ) != 0) {Collections.reverse(actions);}
            return actions;
    }

    @Override
    public void displayExemples() {
        System.out.println(calculateHandshake(1));
        System.out.println(calculateHandshake(10));
        System.out.println(calculateHandshake(19));

//     // Solution of Han-Seung-Hee from Exercism
//        System.out.println(this.calculateHandshake2(1));
//        System.out.println(this.calculateHandshake2(10));
//        System.out.println(this.calculateHandshake2(19));
    }
}