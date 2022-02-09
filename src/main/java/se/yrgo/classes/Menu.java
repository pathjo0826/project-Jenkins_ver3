package se.yrgo.classes;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {

    public void programMenu() throws IOException {

        HashMap<String, String> map = new HashMap<>();
        WordFinder wf = new WordFinder();
        AddWords aw = new AddWords();
        FillMap fm = new FillMap();

        fm.fillMap(map);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Meny: \n Press 1 to add internet abbreviation \n Press 2 to look up internet abbreviation \n Press 3 to exit");
        int input = 0;

        try {
            input = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        while (input != 3) {

            switch (input) {

                case 1:
                    aw.addWord(map);
                    break;
                case 2:
                    System.out.println("Enter abbreviation to look up: ");
                    String abbreviation = scanner.nextLine();
                    System.out.println(wf.findExpression(map, abbreviation)); 
                    break;
            }
            System.out.println("Meny: \n Press 1 to add internet abbreviation \n Press 2 to look up internet abbreviation");
            //input = scanner.nextInt();
        }
        System.out.println("Welcome back!");

    }
}
