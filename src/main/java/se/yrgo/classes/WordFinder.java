package se.yrgo.classes;

import java.util.HashMap;

public class WordFinder {

    /**
     * This method searches a HashMap for a given internet expression. If it exists, it prints out
     * its meaning. If the abbreviation does not exist it throws an ExpressionNotFoundException.
     * @param hash
     * @param input
     * @return
     */

    public String findExpression(HashMap<String,String> hash, String input) throws ExpressionNotFoundException {

            String expression = input.trim().toLowerCase();

            if (hash.get(expression) == null) {
                throw new ExpressionNotFoundException("Idiot! This means nothing.");
            }

        return hash.get(expression);
    }

}

