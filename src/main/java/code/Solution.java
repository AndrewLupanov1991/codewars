package code;

import java.util.*;

class Solution {
    public static String lcs(String x, String y) {

        Set<Character> set = new HashSet<>();

        char[] input1 = x.toCharArray();
        char[] input2 = y.toCharArray();

         char buf1 = ' ';
         char buf2 = ' ';
         for (int i = 0; i < input1.length;i++) {
             buf1 = input1[i];
             for (int j = 0; j < input2.length;j++) {
                 buf2 = input2[j];
                 if (buf1 == buf2 ) {



                 set.add(buf1);
                     break;
                 }
             }
         }
         return set.toString();





        }


    }
