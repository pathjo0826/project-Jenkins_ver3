package se.yrgo.classes;

import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FillMap {

    //private HashMap<String, String>;


    public HashMap<String, String> fillMap(HashMap<String, String> map) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/se/yrgo/classes/abbreviations"));

            String key;
            String value;

            while (true) {
                key = reader.readLine();
                System.out.println(key);
                if (key == null) {
                    break;
                }
                value = reader.readLine();
                if (value == null) {
                    break;
                }
                System.out.println(value);
                map.put(key, value);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return map;
    }

}
