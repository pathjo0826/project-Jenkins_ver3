package se.yrgo.classes;

import java.util.*;

public class ListWords {

    public void listExpressions(HashMap hash){
        Set<String> set = new HashSet<String>();
        set = hash.keySet();

        for (String s : set) {
            System.out.print(s + ", ");
        }

        System.out.println();

        System.out.println("\n");
    }
}
