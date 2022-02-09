package se.yrgo.classes;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class TestFillMap {

    /**
     * Tests that hashMap is loaded (or at least not empty) at
     * start of running the program.
     */

    @Test
    public void testFillMap(){

        HashMap<String, String> hash = new HashMap<>();
        FillMap fm = new FillMap();

        assertFalse(fm.fillMap(hash).isEmpty());
    }
}
