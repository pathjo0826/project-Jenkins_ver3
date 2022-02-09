package se.yrgo.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class TestAddWords {
    private String wordMeaning = "laugh out loud";
    private String abbreviation = "lol";
    private HashMap<String, String> storedWords = new HashMap<>();

    @Test
    public void testAddingWordsToHashMap() {
        storedWords.put(abbreviation, wordMeaning);
        assertEquals(wordMeaning, storedWords.get(abbreviation), "Testing to add one word and then fetching the key from the map");
    }


}