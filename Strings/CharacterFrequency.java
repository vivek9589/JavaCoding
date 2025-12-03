package Strings;

import java.util.HashMap;
import java.util.Map;


public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "HelloWorld";

        System.out.println(" ");

        // Call your function
        countCharacterFrequency(str);
    }

    // Boilerplate function — you write the logic
    public static void countCharacterFrequency(String str) {
        
        
        HashMap<Character,Integer> map = new HashMap<>();


        // count the freq;
        for(char ch : str.toLowerCase().toCharArray())
        {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        // print the freq:

        System.out.println(map);

        System.out.println("");

        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+ " -> " + entry.getValue());
        }
    }
}