
package Streams.beginnerQuestion;
import  java.util.*;
import java.util.stream.*;

public class EvenNumbers
{
    public static void main(String[] args)
    {
        // create stream using Stream.of() 

        
        Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenList = numbers.filter(x -> x%2 == 0).toList();
        System.out.println(evenList);
    }
}