package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Meeting {

    public static String meeting(String s) {

        String result = s.toUpperCase();
        StringBuilder sb = new StringBuilder(result);
        result = sb.append(')').toString();
        char buf;
        int start = 0;
        int end = 0;

        String[] strings = new String[s.length()];
        for (int i = 0; i < result.length(); i++) {
            if (i == 0) {
                sb.setCharAt(i, '(');
                start = i;
            }

            buf = sb.charAt(i);
            if (buf == ':') {
                sb.setCharAt(i, ',');

            } else if (buf == ';') {
                sb.setCharAt(i, ')');
                sb.setCharAt(i + 1, ' ');
                end = i;
            } else if (buf == ' ') {
                sb.setCharAt(i, '(');
            }
        }


        return sb.toString();
    }
}





