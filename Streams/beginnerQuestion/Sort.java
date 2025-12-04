



package beginnerQuestion;
import  java.util.*;
import java.util.stream.*;

public class Sort
{
    public static void main(String[] args)
    {
        // create stream using Stream.of() 

        List<Integer> numbers = Stream.generate(() -> 1).limit(50).toList();
                
            System.out.println(numbers);
        
        
               
        
                // sort the list 
                Stream.of(9,8,7,6,5,4,3,1,0).sorted().forEach(System.out :: println);    
        
        
               //  Stream.of(9,8,7,6,6,3,8).distinct().forEach(System.out :: println);    
        
               Optional<Integer> sum = Stream.of(1,2,3,4,5,6,7,8,9).reduce((a,b) -> a+b);
              System.out.println("Sum Using Reduce method :- " + sum.get());
    }
}