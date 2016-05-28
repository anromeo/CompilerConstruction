// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

import spim.SPIM;

// Prints the string "Hello, World!" to STDOUT.

public class HelloWorld {

    // Return the string "Hello, World!".

    public static String message() {
        return "Hello, World!";
    }

    // Entry point; print a message to STDOUT using the static
    // message() method.
    /* */
    public static void main(String[] args) {
        int i = 32 / 4;
        SPIM.printString(HelloWorld.message());
        SPIM.printString("\n");
    }

}
