
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class FindDuplicateElements {
    public static void main(String[] args) {
        // Step 1: Declare array directly (with duplicates)
        int[] arr = {12, 45, 7, 89, 23, 45, 89, 12};

        // Step 2: Call your method here
        // Example:
        findDuplicates(arr);

        System.out.println("Duplicates using set");
        findDuplicatesUsingSet(arr);


        System.out.println("Duplicates Using Map");
        findDuplicatesUsingMap(arr);

        System.out.println("Duplicates Using Stream");
        findDuplicatesUsingStream(arr);
    }

    // Define your helper method here
    public static void findDuplicates(int[] arr) {

        Arrays.sort(arr);
        List<Integer> duplicateList = new ArrayList<>();

        for(int num = 0 ; num < arr.length-1;num++)
        {
            if(arr[num] == arr[num+1])duplicateList.add(arr[num]);
        }

        System.out.println("Duplicate elements: " + duplicateList);
    
    
    }


    public static void findDuplicatesUsingSet(int[] arr)
    {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int num : arr)
        {
            if(!seen.add(num))
                duplicates.add(num);
        }

        System.out.println(duplicates);
    }

    public static void findDuplicatesUsingMap(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        // store the freq. of each element

        for(int num : arr)
        {
            if(map.containsKey(num))
            {
                map.put(num,map.get(num) + 1);
            }
            else{
                map.put(num,1);
            }
        }


        // traverse map

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " : " +entry.getValue());
        }

        // find duplicates
        System.out.println("Duplicates elements Using Map");

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > 1)
                System.out.print(" "+ entry.getKey());

        }

       
    }


    public static void findDuplicatesUsingStream(int[] arr)
    {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicateSet = new HashSet<>();


        List<Integer> duplicateList = Arrays.stream(arr)
              .filter( num -> !seen.add(num))
              .peek(duplicateSet::add)
              .distinct()
              .boxed()
              .collect(Collectors.toList());



              System.out.println(duplicateList);





    }

}