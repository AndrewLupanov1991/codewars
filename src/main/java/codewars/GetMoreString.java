package codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class GetMoreString {
    public static void main(String[] args) {
        String[] array = new String[]{"abcdygghhjhj", "abcdf", "abcdaaaa"};
        System.out.println(GetMoreString.getString(array));
    }

    public static String getString(String[] array) {
        if(array.length == 0) {
            return "";
        }
        Collections.sort(Arrays.asList(array), new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });


        int index = 1;

        if (array[0].isEmpty()) {
            return "Нет совпадений";
        }

        String tmp = array[0].substring(0,index);
        boolean isFind = false;

        while (!isFind) {
            for (int i = 1; i <array.length ; i++) {
                if(!tmp.equals(array[i].substring(0,index))) {
                    isFind = true;
                    return new StringBuilder(tmp).deleteCharAt(tmp.length() - 1).toString();
                }
            }
            index++;

            if (index>array[0].length()) {
                return tmp;
            }

            tmp = array[0].substring(0,index);


        }return tmp;

    }
}
