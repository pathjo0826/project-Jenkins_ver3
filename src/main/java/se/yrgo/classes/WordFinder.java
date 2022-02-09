package se.yrgo.classes;

import java.util.HashMap;

public class WordFinder {

    /**
     * This method searches for a given internet abbreviation. If it exists, it prints out its meaning.
     * If the abbreviation does not exist it throws an exception and tells you to kys.
     * @param hash
     * @param input
     * @return
     */

    public String findExpression(HashMap<String,String> hash, String input) {

        String expression = input.trim();

        if (hash.get(expression) == null){
            throw new ExpressionNotFoundException("Idiot! This means nothing. Good bye!");

        }

        return hash.get(expression);
    }

}
