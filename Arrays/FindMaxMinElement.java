package Arrays;

import java.util.Scanner;

public class FindMaxMinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array ");

        // Step 1: Read input size
        int n = sc.nextInt();

        System.out.println("Enter the array elements ");


        // Step 2: Read array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Call your methods here
        // Example:
        int max = findMax(arr);
        int min = findMin(arr);

        // Step 4: Print results
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

        sc.close();
    }

    // Define your helper methods here
   
    public static int findMax(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for (int i : arr) 
         max = Math.max(max,i);

        return max;
    }
    
    public static int findMin(int[] arr) { 

        int min = Integer.MAX_VALUE;

        for(int num:arr)
        {
            if(min > num)
                min = num;

        }
            

        return min;
        
     }
}