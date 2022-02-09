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

        Scanner scanner = new Scanner(System.in);
        String key = "wtf";
        String value = "what the fuck";


        HashMap<String, String> hashMap = new HashMap();
        hashMap.put(key, value);

        WordFinder wf = new WordFinder();
        wf.findExpression(hashMap,key);

        assertEquals(value, hashMap.get(key));


    }

    @Test
    public void testExpressionNotFound(){
        final HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("lol", "laughing out loud");

        WordFinder wf = new WordFinder();

        assertThrows(ExpressionNotFoundException.class, () -> wf.findExpression(hashMap,"laaal"));
    }

}
