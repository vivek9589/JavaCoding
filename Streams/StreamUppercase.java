import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUppercase {

    public static void main(String[] args) {
        
        List<String> words =  Arrays.asList("java","lambda","stream","practice");

        List<String> upperWords = words.stream()
                                       .map(String :: toUpperCase)
                                       .collect(Collectors.toList());
        System.out.println(upperWords);                                 

    }
    
}
