



package Streams.beginnerQuestion;
import java.util.*;

public class CountElement
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();

        names.add("vivek");
        names.add("vanshi");
        names.add("srk");
        names.add("sandhya");
        names.add("java");


        System.out.println(" ");

        System.out.println("Total Count of :- " + names.stream().filter(str -> str.toLowerCase().startsWith("v")).count());

        // Map Transformation :- to UpperCase


        List<String> upperCaseList  = names.stream().map(str -> str.toUpperCase()).toList();
        System.out.println(upperCaseList);
       
        
    }
}