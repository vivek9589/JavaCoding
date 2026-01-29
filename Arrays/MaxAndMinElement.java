package Arrays;

import java.util.Scanner;


public class MaxAndMinElement{


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        System.out.println("Enter the size of array ");

       int[] arr = new int[size];

       System.out.println("Enter the array elements");

       for(int i=0;i<arr.length;i++)
       {
            arr[i] = sc.nextInt();
       }
       

       System.out.println("Array Elements are :- ");


       for(int i=0;i<arr.length;i++)
       {
        System.out.print(arr[i] + " ");
       }

       sc.close();

    }

}