package codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SSS {
    public static void main(String[] args) {
        String b = "zasfasxc zxca zxaacvb";
        System.out.println(SSS.getLongPrefix(b));


    }
   public static String getLongPrefix(String input) {
        String[] strings = input.split(" ");
       Collections.sort(Arrays.asList(strings), new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               return o1.length() - o2.length();
           }
       });
       int index = 1;
       String tmp = strings[0].substring(0,index);
       boolean isFind = false;

       while (!isFind) {
           for (int i = 1; i < strings.length; i++) {
               if(!tmp.equals(strings[i].substring(0,index))) {
                   isFind = false;
                   return tmp.substring(0,tmp.length() - 1);
               }

           }
           index++;
           if(index >strings[0].length()) {
               return tmp;
           }
           tmp = strings[0].substring(0,index);
       }

       return tmp;
   }
}
