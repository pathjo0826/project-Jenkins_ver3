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

    @Test
    public void testWordFinder(){


        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("wtf", "what the fuck");

        WordFinder wf = new WordFinder();
        wf.findExpression(hashMap,"wtf");

        assertEquals("what the fuck", hashMap.get("wtf"));

    }

    @Test
    public void testExpressionNotFound(){
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("lol", "laughing out loud");

        WordFinder wf = new WordFinder();

        assertThrows(ExpressionNotFoundException.class, () -> wf.findExpression(hashMap,"laaal"));
    }

}
