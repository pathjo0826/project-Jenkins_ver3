package se.yrgo.classes;

import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FillMap {

    private int noOfMappings = 0;

    /**
     * This method fills up a HashMap with keys of "internet expressions" and values of
     * their respective meanings. The parameters to the HashMap.put() method are read
     * from a text file.
     * @param map
     * @return
     */

    public HashMap<String, String> fillMap(HashMap<String, String> map) {

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/se/yrgo/classes/abbreviations.txt"))){

            String key;
            String value;

            while (true) {
                key = reader.readLine();
                if (key == null) {
                    break;
                }
                value = reader.readLine();
                if (value == null) {
                    break;
                }
                map.put(key, value);
                setNoOfMappings(1);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return map;
    }

    //Setter
    public void setNoOfMappings(int number){
        this.noOfMappings = noOfMappings + number;
    }

    //Getter
    public int getNoOfMappings(){
        return noOfMappings;
    }
}
