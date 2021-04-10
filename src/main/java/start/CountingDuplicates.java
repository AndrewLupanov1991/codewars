package start;

import java.util.HashSet;
import java.util.Set;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        int counter = 0;
        int result = 0;


        char[] chars = text.toLowerCase().toCharArray();
        Set<Character> set = new HashSet<>();
        for(char c : chars) {
            set.add(c);
        }
        for (Character c : set) {
            for (int i = 0; i < chars.length ; i++) {
                if (c == chars[i]) {
                    counter++;
                    if (counter > 1) {
                        result++;
                        break;
                    }
                }
            }
            counter = 0;
        }
        return result;

    }
}