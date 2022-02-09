package se.yrgo.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;



public class AddWordsTest {
    private String userEntersWords;
    private String shortWord;


    @Test
    public void TestAddingWordsToHashMap() {

        HashMap<String, String> storedWords = new HashMap<>();

        shortWord = "lol";
        userEntersWords = "laugh out loud";

        storedWords.put(shortWord, userEntersWords);

        assertEquals(storedWords.put(shortWord, userEntersWords), storedWords.get(shortWord), "Testing to add one word and then fetching the key from the map");
    }


}