package org.example;

import java.io.FileNotFoundException;

public class BeatlesException extends Exception {
    public BeatlesException (String s) {
        super("Beatles " + s);
    }
}
