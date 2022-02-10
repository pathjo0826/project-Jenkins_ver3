package se.yrgo.classes;

import java.util.HashMap;
import java.util.Scanner;

public class WordFinder {

    //Scanner scanner = new Scanner(System.in);

    /**
     * This method searches a HashMap for a given internet expression. If it exists, it prints out
     * its meaning. If the abbreviation does not exist it throws an exception and stops running.
     * @param hash
     * @param input
     * @return
     */

    public String findExpression(HashMap<String,String> hash, String input) {

            String expression = input.trim();

            if (hash.get(expression) == null) {
                throw new ExpressionNotFoundException("Idiot! This means nothing. Good bye!");
            }

        return hash.get(expression);
    }

}
