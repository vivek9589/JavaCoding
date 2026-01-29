package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = list.stream();
        streamOfCollection.forEach(System.out::println);
    }
}