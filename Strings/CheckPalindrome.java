package Strings;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "madam";


        System.out.println(" ");
        // Call your palindrome function
        boolean result = isPalindrome(str);

        if (result) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    // Boilerplate function — you write the logic
    public static boolean isPalindrome(String str) {
        
        char[] ch = str.toCharArray();

        int left = 0;
        int right = ch.length-1;

        while(left <= right)
        {
            if(ch[left] != ch[right]) return false;

            left++;
            right--;
        }

        return true;

    }

    public static boolean isPalindromeReverse(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        String reversedString = sb.reverse().toString();

        if(!str.equals(reversedString)) return false;

        return true;

        // return str.equals(reversedString);

    }
}