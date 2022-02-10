package se.yrgo.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Scanner;

public class TestAddWords {
    private String wordMeaning = "laugh out loud";
    private String abbreviation = "lol";
    private HashMap<String, String> storedWords = new HashMap<>();


    /**
     * This test adds one abbreviation and the meaning to that abbreviation to a HashMap.
     * Once that is done it will look for the word that was added and check if the abbreviation matches the word.
     */
    @Test
    public void testAddingWordsToHashMap() {
        storedWords.put(abbreviation, wordMeaning);
        assertEquals(wordMeaning, storedWords.get(abbreviation));
    }

    /**
     * This test adds one abbreviation to the Hashmap and then checks that it exists in the map.
     * after that is done it changes variable mapSize to 1 and then tries to add the same abbreviation again.
     * Then it checks that the mapSize that = 1 still has the same size as the HashMap.
     */
    @Test
    public void testAddingSameWordMultipleTimes() {
        int mapSize = 0;
        storedWords.put(abbreviation, wordMeaning);
        assertEquals(wordMeaning, storedWords.get(abbreviation));
        mapSize = storedWords.size();
        storedWords.put(abbreviation, wordMeaning);
        assertEquals(mapSize, storedWords.size());
    }

    /**
     * This test checks if a String = "y" and then adds a word to a HashMap.
     * Then it changes the int variable mapSize to be the same size as the Hashmap.
     * When this is done it will check that the variable mapSize is the same size as the HashMap and the adding of an abbreviation has been successfully done.
     */
    @Test
    public void testAgreeingToEnterAbbreviationToMap() {
        String agree = "y";
        int mapSize = 0;
        Scanner scanner = new Scanner(agree);
        if (scanner.equals(agree)) {
            storedWords.put(abbreviation, wordMeaning);
            mapSize = storedWords.size();
        }
        assertEquals(mapSize, storedWords.size());
    }
}