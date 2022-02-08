package se.yrgo.classes;

import java.util.HashMap;
import java.util.Scanner;

public class WordFinder {

    /**
     * This method searches for a given internet abbreviation. If it exists, it prints out its meaning.
     * If the abbreviation does not exist it throws an exception.
     * @param hash
     * @param input
     * @return
     */

    public String findExpression(HashMap<String,String> hash, String input) {

        String expression = input.trim();

        if (hash.get(expression) == null){
            throw new ExpressionNotFoundException("This abbreviation has no meaning.");
        }

        return hash.get(expression.trim());
    }

}
