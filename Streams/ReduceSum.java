package Streams;

import java.util.Arrays;
import java.util.List;

public class ReduceSum {
    
    public static void main(String[] args) {
        
    List<Integer> numbers = Arrays.asList(1,2,3,4,5);

    int sum = numbers.stream()
                     .reduce(0, (a,b) -> a+b);

    System.out.println(sum);

    int product = numbers.stream().reduce(1,(a,b)-> a*b );
    System.out.println("Product = " + product);


    // find maximum
    int max = numbers.stream().reduce(Integer.MIN_VALUE, (a,b) -> a > b ? a:b);
    System.out.println("Max = " + max);






    }

}
