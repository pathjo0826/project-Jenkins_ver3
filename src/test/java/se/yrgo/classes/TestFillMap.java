package se.yrgo.classes;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestFillMap {

    /**
     * Tests that the HashMap is loaded at program initialization
     * with the number of mappings that can be found in abbreviations.txt.
     * @throws IOException
     */

    @Test
    public void testFillMap() throws IOException{

        int noOfExpectedMappings = 32;

        HashMap<String, String> hash = new HashMap<>();

        FillMap fm = new FillMap();
        fm.fillMap(hash);

        System.out.println("Number of expected mappings: " + noOfExpectedMappings);
        System.out.println("Actual number of mappings: " + hash.size());

        assertEquals(noOfExpectedMappings, hash.size());
    }
}
