package se.yrgo.classes;

import java.util.*;

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

        System.out.println();
        System.out.println("\n");
    }
}
