package se.yrgo.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Scanner;

public class TestWordFinder {

    /**
     * Tests that findExpression-method extracts the value associated with the
     * key entered as argument. The test includes correct trimming of input String
     * parameter, i.e. whitespaces are removed and automatic conversion to lower case
     * letters occurs.
     */

    @Test
    public void testWordFinder(){

        String key1 = "wtf";
        String key2 = " wtf ";
        String key3 = " WTF";
        String value = "what the fuck";


        HashMap<String, String> hashMap = new HashMap();
        hashMap.put(key1, value);

        WordFinder wf = new WordFinder();

        assertEquals(value, wf.findExpression(hashMap,key1));
        assertEquals(value, wf.findExpression(hashMap,key2));
        assertEquals(value, wf.findExpression(hashMap,key3));

    }

    /**
     * Tests that findExpression-method throws an ExpressionNotFoundException if the
     * entered internet expression does not exist.
     */

    @Test
    public void testExpressionNotFound(){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("lol", "laughing out loud");

        WordFinder wf = new WordFinder();

        assertThrows(ExpressionNotFoundException.class, () -> wf.findExpression(hashMap,"something that does not exist"));
    }

}
