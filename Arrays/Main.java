package Arrays;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int len  = sc.nextInt();
        int[] arr = new int[len];
        
        System.out.println("enter the array element of size "+ len);
        
        for(int i=0;i<len;i++)
        {
            arr[i] = sc.nextInt();
            
        }
        
        System.out.println("Arrays elements are :- ");
        
          for(int i=0;i<len;i++)
        {
            System.err.println(arr[i] + " ");
            
        }
    }
}