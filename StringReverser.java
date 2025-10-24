public class StringReverser {

    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str; // Handle null or empty strings
        }

        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move pointers
            left++;
            right--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String originalString1 = "hello";
        String reversedString1 = reverseString(originalString1);
        System.out.println("Original: " + originalString1 + ", Reversed: " + reversedString1); // Output: olleh

        String originalString2 = "Java Programming";
        String reversedString2 = reverseString(originalString2);
        System.out.println("Original: " + originalString2 + ", Reversed: " + reversedString2); // Output: gnimmargorP avaJ

        String originalString3 = "";
        String reversedString3 = reverseString(originalString3);
        System.out.println("Original: '" + originalString3 + "', Reversed: '" + reversedString3 + "'"); // Output: ''

        String originalString4 = null;
        String reversedString4 = reverseString(originalString4);
        System.out.println("Original: " + originalString4 + ", Reversed: " + reversedString4); // Output: null
    }
}