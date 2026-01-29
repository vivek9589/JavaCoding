package Lambda;

import java.util.*;


public class LambdaMap {

    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(2,4,6,8);
        nums.stream()
            .map( n -> n*n)
            .forEach(System.out::println);

        


    }
    
}
