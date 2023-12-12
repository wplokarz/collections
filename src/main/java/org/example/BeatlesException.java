package org.example;


public class BeatlesException extends Exception {
    public BeatlesException (String s) {
        super("Beatles " + s);
    }
}
