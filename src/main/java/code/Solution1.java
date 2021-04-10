package code;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static Object[] longestRepetition(String s) {
        if (s.equals("")) {
            return new Object[]{"",0};
        }
        int counter = 1;
        int counter2 = 1;
        char buf = ' ';
        char buf2 = ' ';
        for (int i = 0; i < s.length()-1;i++) {
            buf = s.charAt(i);
            if (buf == s.charAt(i+1)) {
                counter++;
            }
            if ( counter > counter2) {
                buf2 = buf;
                counter2 = counter;

            }
            if (buf!= s.charAt(i+1)) {
                counter=1;
            }

        }
        return new Object[]{buf2, counter2};
     }

    }

