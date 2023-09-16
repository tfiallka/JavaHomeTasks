import java.util.LinkedHashMap;
import java.util.Map;

public abstract class CharactersInString {
    public static Map<Character, Integer> getCharsCount(String s) {
        char[] stringToLetter = s.toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : stringToLetter) {
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
