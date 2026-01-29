package Lambda;

import java.util.*;
import java.util.stream.Stream;

public class LambdaForEach {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = list.stream();
        streamOfCollection.forEach(item -> System.out.println(item));
    }
}