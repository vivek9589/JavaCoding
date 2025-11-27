import java.util.Scanner;
import java.util.TreeSet;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Step 2: Read array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Call your method here
        int secondLargest = findSecondLargest(arr);
        int SecondLargestUsingSet = findSecondLargestUsingSet(arr);

        // Step 4: Print result
        System.out.println("Second largest element: " + secondLargest);
        System.out.println("Second largest element Using Set : " + SecondLargestUsingSet);

        sc.close();
    }

    // Define your helper method here
    public static int findSecondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest =  Integer.MIN_VALUE;

        for(int num : arr)
        {
            if(num > largest)
            {
                secondLargest = largest;
                largest = num;
               
            }else if(num > secondLargest && largest != num)
                secondLargest = num;
        }

        return secondLargest;
   
    }


    // using Tree Set

    public static int findSecondLargestUsingSet(int[] arr)
    {
       TreeSet<Integer> set = new TreeSet<>();

       for(int num : arr)
       {
             // duplicate elements will be ignore 
            set.add(num);
       }
       set.pollLast();


       return set.last();


    }
}