package se.yrgo.classes;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class AddWords {
    private String abbreviation;
    private String wordMeaning;
    private String answer;

    /**
     * Method with a HashMap that stores two different strings
     * The Key is the short word that you normally say and the Value is the meaning of the short word.
     * If the word already exists in the library it throws a IOException with a message.
     */
    public HashMap<String, String> addWord(HashMap<String, String> map, Scanner scan) throws IOException {


        try {
            System.out.println("What abbreviation would you like to add?");
            abbreviation = scan.nextLine();
            if(map.containsKey(abbreviation)){
                System.out.println("This word already exists in Library");
                return map;
            }
            System.out.println("You would like to add " + abbreviation);
            System.out.println("What does this abbreviation mean?");
            wordMeaning = scan.nextLine();
            System.out.println(abbreviation + " = " + wordMeaning + "?");
            System.out.println("Press y for yes and n for no");
            answer = scan.nextLine();
            if (answer.equalsIgnoreCase("y")){
                map.put(abbreviation, wordMeaning);
            }else {
                return map;
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return map;
    }
}
