package finalexam;
import java.util.*;

public class MostFrquent {

    public static void main(String[] args) {
        String str = "arrraaaaaay";
        System.out.println(mostFrequent(str));
    }

    public static char mostFrequent(String str) {
        char result = ' ';
        int maxOccurring = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
            if (map.get(ch) > maxOccurring) {
                maxOccurring = map.get(ch);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxOccurring) {
                result = entry.getKey();
            }
        }
        return result;
    }
}


