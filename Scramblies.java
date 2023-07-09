import java.util.HashMap;
import java.util.Map;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        Map<Character, Integer> charCount1 = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCount1.put(c, charCount1.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> charCount2 = new HashMap<>();
        for (char c : str2.toCharArray()) {
            charCount2.put(c, charCount2.getOrDefault(c, 0) + 1);
        }

        for (char c : charCount2.keySet()) {
            if (!charCount1.containsKey(c) || charCount1.get(c) < charCount2.get(c)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "rkqodlw";
        String str2 = "world";
        boolean result = scramble(str1, str2);
        System.out.println(result);  // Output: true
    }
}