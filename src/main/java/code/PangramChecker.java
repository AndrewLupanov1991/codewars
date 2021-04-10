package code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public boolean check(String sentence){
        String s = sentence.toLowerCase();
        char[] input = s.toCharArray();
        Arrays.sort(input);
        Set<Character> characters = new HashSet<>();
        for (Character c : input) {
            characters.add(c);
        }
        if (characters.size() > 26) {
            return true;
        }




       return false;
    }
}
