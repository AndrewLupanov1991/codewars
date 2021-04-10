package code;

import java.util.Arrays;

public class Fracts {

    public static String convertFrac(long[][] lst) {
       long[][] input = lst;
       long buf;
        long[] array = new long[lst.length];
        int index = 0;


       for (int i = 0; i < input.length; i++) {
           for (int j = 0; j < input[i].length - 1; j++) {
               buf = input[i][j];

               if (buf % buf == 0 &&  input[i][j+1] % buf == 0) {
                   input[i][j] = buf / buf;
                   input[i][j+1] = input[i][j+1] / buf;
               }
               if (j == 0) {
                   array[index++] = lst[i][j+1];
               }


           }
       }
        long digit = 1;
       for (int i = 0; i < array.length;i++) {
           if (digit % array[i] !=0) {
               digit++;
               i=0;
           }

       }
       int number = 0;
        StringBuilder sb = new StringBuilder();
       for (int i = 0; i < input.length;i++) {
           for (int j = 0; j < input[i].length - 1;j++) {
               /*if (i == 0) {
                   sb.append('[');
               }*/
               input[i][j] = digit / array[number];
               sb.append('(');
               sb.append(input[i][j]);
               sb.append(',');
               input[i][j+1] = digit;
               sb.append(digit);
               sb.append(')');
               /*if (i == array.length-1) {
                   sb.append(']');
               }*/
               number++;


           }
       }




       return sb.toString();  //[(6,12)(4,12)(3,12)]


    }

}