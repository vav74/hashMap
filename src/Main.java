import java.util.HashMap;
import java.util.Map;

public class Main {
    public static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    static Map.Entry<Character, Integer> ent = null;

    public static void main(String[] args) {
        Map<Character, Integer> letterMap = new HashMap<>();
        char[] chars = TEXT.toCharArray();
        for (char c : chars) {
            if (Character.isLetter(c)) {
                if (letterMap.containsKey(c)) {
                    letterMap.put(c, letterMap.get(c) + 1);
                } else {
                    letterMap.put(c, 1);
                }
            }
        }
        //Максимум:
        for (Map.Entry<Character, Integer> entry : letterMap.entrySet()) {
            if (ent == null || entry.getValue().compareTo(ent.getValue()) > 0) {
                ent = entry;
            }
        }
        System.out.println("Максимум: " + ent.getKey() + " - " + ent.getValue());

        //Минимум:
        /* for (Map.Entry<Character, Integer> entry : letterMap.entrySet()) {
            if (ent == null || entry.getValue().compareTo(ent.getValue()) < 0) {
                ent = entry;
            }
        }
        System.out.println("Минимум: " + ent.getKey() + " - " + ent.getValue());*/

        int min = Integer.MAX_VALUE;
        char minLetter = 0;
        for (char c : letterMap.keySet()) {
            int frq = letterMap.get(c);
            if (frq < min) {
                min = frq;
                minLetter = c;
            }
        }
        System.out.println("Минимум: " + minLetter + " - " + min);
    }
}