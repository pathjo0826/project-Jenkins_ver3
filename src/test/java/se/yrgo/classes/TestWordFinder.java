package se.yrgo.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Scanner;

public class TestWordFinder {


    @Test
    public void test(){
        System.out.println("This is a test");
    }

    /**
     * Tests that "findExpression" method extracts the value associated with
     * key entered as argument. The method ensures that whitespaces are trimmed
     * from the front- and end of the entered string.
     */

    @Test
    public void testWordFinder(){

        String key1 = "wtf";
        String key2 = " wtf ";
        String value = "what the fuck";


        HashMap<String, String> hashMap = new HashMap();
        hashMap.put(key1, value);
        hashMap.put(key2, value);

        WordFinder wf = new WordFinder();
        wf.findExpression(hashMap,key1);

        assertEquals(value, hashMap.get(key1));
        assertEquals(value, hashMap.get(key1));


    }

    /**
     * Tests that "findExpression" throws an ExpressionNotFoundException if the entered
     * internet expression (key in hashMap) does not exists.
     */

    @Test
    public void testExpressionNotFound(){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("lol", "laughing out loud");

        WordFinder wf = new WordFinder();

        assertThrows(ExpressionNotFoundException.class, () -> wf.findExpression(hashMap,"something that does not exist"));
    }

}
