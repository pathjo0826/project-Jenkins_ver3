package se.yrgo.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.HashMap;



public class TestAddWords {
    private String userEntersWords;
    private String shortWord;
    private HashMap<String, String> storedWords;

    public void addWordsTest() {
        storedWords = new HashMap<>();
        shortWord = "lol";
        userEntersWords = "laugh out loud";
        storedWords.put(shortWord, userEntersWords);
    }

    @Test
    public void testAddingWordsToHashMap() {
        assertEquals(storedWords.put(shortWord, userEntersWords), storedWords.get(shortWord), "Testing to add one word and then fetching the key from the map");
    }


}