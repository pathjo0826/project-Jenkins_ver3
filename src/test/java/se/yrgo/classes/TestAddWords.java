package se.yrgo.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

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


}