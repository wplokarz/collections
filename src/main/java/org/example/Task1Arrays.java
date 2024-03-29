package org.example;

import java.util.*;

public class Task1Arrays {
    public static void main(String[] args) {
        String lyrics = new Lyrics().lyrics;
        lyrics = lyrics.toLowerCase().replace("\n", " ").replace(",", "");
        String[] splitLyrics = lyrics.split(" ");
        System.out.println(countWords(splitLyrics));
        System.out.println(listSortedByLength(splitLyrics));
        System.out.println(removeWords(splitLyrics));
    }
    // take array of words and return map with word and number of appearances
    private static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String str:words) {
            if (wordsCount.containsKey(str)) {
                int i = wordsCount.get(str);
                i++;
                wordsCount.put(str, i);
            }
            else {
                wordsCount.put(str, 1);
            }
        }
        return wordsCount;
    }

    // take array of strings and return list sorted by length of string
    private static List<String> listSortedByLength(String[] words) {
        List<String> listOfWords = new ArrayList<>(Arrays.stream(words).distinct().toList());
        listOfWords.sort(Comparator.comparing(String::length));
        return listOfWords;
    }
    // define default values and toggle method overwriting
    private static List<String> removeWords(String[] words) {
        List<String> wordsExcluded = new ArrayList<>();
        wordsExcluded.add("yellow");
        wordsExcluded.add("submarine");
        return removeWords(words, wordsExcluded);
    }

    // return list of strings without specific words
    private static List<String> removeWords(String[] words, List<String> excludedWords) {
        List<String> newList = new ArrayList<>();
        for (String word: words) {
            if (!excludedWords.contains(word)) {
                newList.add(word);
            }
        }
        return newList;
    }
}