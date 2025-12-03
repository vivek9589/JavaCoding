package Strings;

import java.util.*;

public class CheckAnagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println("");
        // Call your anagram function
        boolean result = isAnagram(str1, str2);

        isAnagramUsingMap(str1,str2);

        if (result) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    // Boilerplate function — you write the logic
    public static boolean isAnagram(String str1, String str2) {
        
        if(str1.length() != str2.length()) return false;

        char[] chars1 = str1.toLowerCase().toCharArray();
        char[] chars2 = str2.toLowerCase().toCharArray();


        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
        
        



    }


    public static void isAnagramUsingMap(String str1, String str2) 
    {
        HashMap<Character,Integer> map = new HashMap<>();

        
        System.out.println(" ");

        for(char ch: str1.toLowerCase().toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0) +1);
        }

        System.out.println(map);

        // decrease the count
        for(char ch:str2.toLowerCase().toCharArray())
        {
            map.put(ch, map.get(ch)-1);
        }
         System.out.println(map);

        // iterate map
        /*
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue() != 0) return false;

            return true;
        }

        return false;

 */

    }
}