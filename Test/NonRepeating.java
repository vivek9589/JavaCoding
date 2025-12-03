package Test;
import java.util.*;

public class NonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char ans = '-';
        for (char ch : s.toCharArray()) {
            if (map.get(ch) == 1) {
                ans = ch;
                break;
            }
        }

        System.out.println(ans);
    }
}
