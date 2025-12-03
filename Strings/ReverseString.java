package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "JAVA";

        // Call your reverse function
        String reversed = reverseString(str);
         
        System.out.println(" ");
        System.out.println("Reversed String: " + reversed);

        System.out.println("Reversed String Using While loop :" + reverseStringUsingWhile(str));
        
        System.out.println("reverseStringUsingStringBuilder :- " + reverseStringUsingStringBuilder(str));
    }

    // Boilerplate function — you write the logic
    public static String reverseString(String str) {
        
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();

       for(int i = chars.length-1;i>=0;i--)
       {
            sb.append(chars[i]);
       }
        
        return sb.toString(); 
    }

    public static String reverseStringUsingWhile(String str)
    {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while(left < right)
        {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            

            left++;
            right--;
        }
        return new String(chars);
    }


    public static String reverseStringUsingStringBuilder(String str)
    {
       StringBuilder sb = new StringBuilder(str);

       return sb.reverse().toString();
    }

}