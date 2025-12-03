package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyElement {
    public static void main(String[] args) {
        String str = "HelloWorld";


        System.out.println("");
        // Call your function
        findMaxFrequencyElement(str);
    }

    // Boilerplate function — you write the logic
    public static void findMaxFrequencyElement(String str) {
       
        HashMap<Character,Integer> map = new HashMap<>();

        // count the freq;

        for(char ch : str.toLowerCase().toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // find the max
        int maxCount = Integer.MIN_VALUE;
        char maxChar = ' ';
        

        for(Map.Entry<Character,Integer> entry : map.entrySet() )
        {
            // maxCount = Math.max(maxCount, entry.getValue());
            if(entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
            
        }
        System.out.println("max Frequency : ");
        System.out.println(maxChar + " -> " + maxCount);
 
}

    
}