package se.yrgo.classes;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class Menu {

    public void programMenu() throws IOException {

        HashMap<String, String> map = new HashMap<>();
        FillMap fm = new FillMap();
        WordFinder wf = new WordFinder();
        AddWords aw = new AddWords();
        ListWords lw = new ListWords();

        fm.fillMap(map);

        Scanner scanner = new Scanner(System.in);
        int input = 0;

        foreverloop:
        while (true) {
            System.out.println("Menu: \n Press 1 to add internet abbreviation \n Press 2 to look up internet abbreviation \n Press 3 to list all \n Press 4 to exit");

            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }

            switch (input) {

                case 1:
                    map = aw.addWord(map, scanner);
                    break;

                case 2:
                    EnterExpressionUI ex = new EnterExpressionUI();
                    System.out.println(wf.findExpression(map, ex.enterExpression(scanner)));
                    break;

                case 3:
                lw.listExpressions(map);
                break;

                case 4:
                break foreverloop;
                
                default:
                    System.out.println("Wrong input, enter one of the following");
                    break;

            }
        }
        System.out.println("Welcome back!");

    }
}