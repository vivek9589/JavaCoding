package Lambda;

import java.util.*;

public class LambdaFilter {


    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("apple","banana","cherry","date");

        System.out.println("");
        
        words.stream()
             .filter( w -> w.endsWith("y"))
             .forEach(System.out::println);
    }
}
