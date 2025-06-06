import java.util.*;
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        char res = ' ';
        Map<Character, Integer> map = new HashMap<>();
        int maxcnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            } else {
                map.put(str.charAt(i), 1);
            }
            if (map.get(str.charAt(i)) > maxcnt) {
                res = str.charAt(i);
                maxcnt = map.get(str.charAt(i));
            }
        }
        return res;
    }
}
