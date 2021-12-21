package com.hatcattt.exercism.twofer;

public class Twofer {
    public String twofer(String name) {
        // using ternary operator
        return (name == null) ? "One for you, one for me." : "One for " + name + ", one for me.";
    }

    public static void main(String[] args) {
        Twofer tf = new Twofer();
        System.out.println(tf.twofer("Rayan"));
    }
}