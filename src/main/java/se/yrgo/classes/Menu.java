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
        int input = 0;

        foreverloop:
        while (true) {
            System.out.println("Menu: \n Press 1 to add internet abbreviation \n Press 2 to look up internet abbreviation \n Press 3 to exit");

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
                    System.out.println("Enter abbreviation to look up: ");
                    String expression = scanner.nextLine();
                    System.out.println(wf.findExpression(map, expression));
                    break;
                case 3:
                    break foreverloop;
                default:
                    System.out.println("Wrong input, enter one of the following");
                    break;

            }
        }
        System.out.println("Welcome back!");

    }
}
