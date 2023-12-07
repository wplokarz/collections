package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Part4 {

    public static FileReader readFile() throws BeatlesException {
        try {
            FileReader file = new FileReader("beatles.txt");
            return file;
        }
        catch (FileNotFoundException e) {
            throw new BeatlesException("not found");
        }
    }
    public static StringBuilder readCharacters(FileReader reader) throws IOException {
        StringBuilder textFromFile = new StringBuilder();
        int nextChar;
        while ((nextChar = reader.read()) != -1 ) {
            textFromFile.append((char) nextChar);
        }
        return textFromFile;
    }
    private static boolean verifyTextInside(StringBuilder str, String phrase) throws BeatlesException {
        if (!(str.indexOf(phrase) > -1)) {
            throw new BeatlesException("Not in file");
        }
        return true;
    }

    public static void main(String[] args) throws BeatlesException, IOException {
        System.out.print(verifyTextInside(readCharacters(readFile()), "submarine"));
    }
}
