package se.yrgo.classes;

import java.io.IOException;
import java.util.HashMap;

public class AddWords {
    private String shortWord;
    private String userEntersWords;

    /**
     * Method with a HashMap that stores two different strings
     * The Key is the short word that you normally say and the Value is the meaning of the short word.
     * If the word already exists in the library it throws a IOException with a message.
     * @throws IOException
     */
    public HashMap<String, String> addWord(HashMap<String, String> map) throws IOException {
        HashMap<String, String> storedWords = new HashMap<>();

        try {
            if (storedWords.containsValue(shortWord)) {
                throw new IOException("Word Already Exists in Library");
            }
            else {
                storedWords.put(shortWord, userEntersWords);
            }

        } catch (IOException ex) {
            System.err.println("Something went wrong here");
            ex.printStackTrace();
        }
        return map;
    }
}
