

// Convert a list to a stream.
package Streams.beginnerQuestion;
import java.util.*;

public class printStream
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();

        names.add("vivek");
        names.add("vanshi");
        names.add("srk");
        names.add("sandhya");
        names.add("java");


        names.stream().forEach(System.out :: println);
        
    }
}