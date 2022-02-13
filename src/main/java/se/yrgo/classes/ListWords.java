package se.yrgo.classes;

import java.util.Set;
import java.util.HashMap;

public class ListWords {

    /**
     * This method lists all internet expressions stored in the HashMap.
     * @param hash
     */

    public void listExpressions(HashMap hash){
        Set<String> set =  hash.keySet();

        System.out.println("All expressions: ");

        for (String s : set) {
            System.out.print(s + ", ");
        }

        System.out.println("\n");
    }
}
