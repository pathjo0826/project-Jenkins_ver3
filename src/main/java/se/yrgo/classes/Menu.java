package se.yrgo.classes;

import java.util.HashMap;
import java.util.Scanner;

public class Menu {

    public void programMenu() {

        HashMap <String, String> map = new HashMap<>();
        WordFinder wf = new WordFinder();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Meny: \n Press 1 to add internet abbreviation \n Press 2 to look up internet abbreviation");
        int input = scanner.nextInt();

        switch (input) {

            case 1:

                break;

            case 2:
            String abbreviation = scanner.nextLine();
            wf.findExpression(map, abbreviation);
                break;
        }

    }
}
