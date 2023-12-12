package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Part4 {
    public static void main(String[] args) throws BeatlesException, IOException {
        System.out.print(IsPhraseInTheFile("beatles.txt", "submarine"));
    }

    // take filename and check if specific phrase exists in that file
    public static boolean IsPhraseInTheFile (String filename, String phrase) throws BeatlesException, IOException {
        FileReader file = readFile(filename);
        StringBuilder readFile = createStringFromFile(file);
        return checkIfPhraseExistInString(readFile, phrase);
    }

    // read file and return as object, if file doesn't exist throw error
    public static FileReader readFile(String filename) throws BeatlesException {
        try {
            FileReader file = new FileReader(filename);
            return file;
        }
        catch (FileNotFoundException e) {
            throw new BeatlesException("not found");
        }
    }

    // return file reader object as string
    public static StringBuilder createStringFromFile(FileReader reader) throws IOException {
        StringBuilder textFromFile = new StringBuilder();
        int nextChar;
        while ((nextChar = reader.read()) != -1 ) {
            textFromFile.append((char) nextChar);
        }
        return textFromFile;
    }

    // return true if specific phrase can be found in provided string
    private static boolean checkIfPhraseExistInString(StringBuilder str, String phrase) throws BeatlesException {
        if (!(str.indexOf(phrase) > -1)) {
            throw new BeatlesException("Not in file");
        }
        return true;
    }
}
