import java.util.Scanner;

public class ReverseArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array elements ");

        for(int i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();


        System.out.print("Original Array :- ");

        
        for(int i=0;i<arr.length;i++)
           System.out.print(" " + arr[i]);

        // Reverse array 

        System.out.println("Reversed Array :- ");

        for(int i=arr.length-1; i >=0 ;i--)
            System.out.print(" " + arr[i]);

    }
}