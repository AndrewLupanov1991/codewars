package start;

import java.util.Arrays;

public class TwoToOne {

    public static String longest(String s1, String s2) {
        if (s1.length() > s2.length()) {
           char[] chars = s1.toCharArray();

        }
        if (s1.length()<s2.length()){
            char[] chars = s1.toCharArray();
            Arrays.sort(chars);
            String result2 = new String(chars);
            return result2;

        }
        return s1;

    }
    public int[] sort(int[] ints) {
        int buf;
        int bufUpperCase;
        int bufLoverCase;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < ints.length - 1; i++) {
                if (ints[i] < 97) {
                    bufUpperCase = ints[i] % 65;
                }else{
                    bufLoverCase = ints[i] % 97;

                }
                if(ints[i] > ints[i + 1]) {
                    isSorted = false;
                    buf = ints[i];
                    ints[i] = ints[i + 1];
                    ints[i + 1] = buf;
                }
            }
        }
        return ints;
    }
}

