package Strings;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String str = "HelloWorld";

        // Call your function
        countVowelsAndConsonants(str);
    }

    // Boilerplate function — you write the logic
    public static void countVowelsAndConsonants(String str) {
       int vowel = 0;
       int consonant = 0;

       char[] chars = str.toLowerCase().toCharArray();


       for(char ch : chars)
       {
        if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' ) vowel++;
        else consonant++;
       }

       System.out.println(" ");

       System.out.println("Vowels :- " + vowel);
       System.out.println("consonant :- " + consonant);
       


    }


    public static void countVowelsAndConsonants(String str)
    {
        int vowel = 0;
        int consonant = 0;

        char[] chars = str.toLowerCase().toCharArray();

        for(char ch : chars)
        {
             if (ch >= 'a' && ch <= 'z') { // ✅ only process alphabets
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else {
                consonant++;
            }
        }

        }
    }


}