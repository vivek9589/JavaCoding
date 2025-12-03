package HashMap;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args) {
        String str = "programming";

        // Call your function
        findDuplicates(str);
    }

    // Boilerplate function — you write the logic
    public static void findDuplicates(String str) {
        
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : str.toLowerCase().toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        System.out.println(" ");
        System.out.println("Duplicate elements with their Frequencies");
        

        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > 1)
            {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}