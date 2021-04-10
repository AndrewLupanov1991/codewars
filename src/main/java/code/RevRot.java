package code;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RevRot {

    public static String revRot1(String strng, int sz) {

        if (strng.equals("") || sz <= 0 || sz > strng.length()) {
            return "";
        }
        List<String> list = new ArrayList<>();

        char[] charsInputString = strng.toCharArray();

        char[] chars1 = new char[sz + 1];
        char[] chars2 = new char[strng.length() - sz + 1];
        int dlinaOfMas = chars2.length;

        String result1 = new String();
        String result2 = new String();

        System.arraycopy(charsInputString, 0, chars1, 0, sz);
        System.arraycopy(charsInputString, sz, chars2, 0, charsInputString.length - sz);

        int sum = 0;
        int buf = 0;
        int sum2 = 0;
        int buf2 = 0;

        for (int i = 0; i < chars1.length - 1; i++) {

            buf = Character.getNumericValue(chars1[i]);
            sum = sum + (buf * buf * buf);
        }
        if (sum % 2 == 0) {
            StringBuilder sb = new StringBuilder(new String(chars1));
            result1 = sb.reverse().toString().trim();

        } else {
            StringBuilder sb = new StringBuilder(new String(chars1));
            char bufForChar = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.insert(chars1.length - 2, bufForChar);
            result1 = sb.toString().trim();
        }

        if (sz > dlinaOfMas) {
            result2 = "";
        } else {
            for (int i = 0; i < chars2.length - 1; i++) {
                buf2 = Character.getNumericValue(chars2[i]);
                sum2 = sum2 + (buf2 * buf2 * buf2);
            }
            if (sum2 % 2 == 0) {
                StringBuilder sb = new StringBuilder(new String(chars2));
                result2 = sb.reverse().toString().trim();

            }


        }
        if (sum2 % 2 != 0) {
            StringBuilder sb = new StringBuilder(new String(chars2));
            char bufForChar = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.insert(chars1.length - 2, bufForChar);
            result2 = sb.toString().trim();

        }


        return result1 + result2;
    }


    public static String revRot2(String strng, int sz) {
        if (strng.equals("") || sz <= 0 || sz > strng.length()) {
            return "";
        }
        String result = new String();
        String inputString = strng;
        StringBuilder sb = new StringBuilder(inputString);
        int dlina = inputString.length();
        if (sz > dlina){
            result=result + "";
        }
        while (sz <= dlina) {
            char[]chars = new char[sz + 1];
            int sum = 0;
            int buf = 0;
            for (int i = 0; i < sz;i ++) {
                chars[i] = sb.charAt(i);
                buf = Character.getNumericValue(chars[i]);
                sum = sum + (buf*buf*buf);
            }
            if (sum % 2 == 0) {
                String result1 = new String(chars);
                StringBuilder stringBuilder2 = new StringBuilder(result1);
                result1 = stringBuilder2.reverse().toString().trim();
                result = result + result1;
            }else if (sum % 2 != 0) {
                String result2 = new String(chars);
                StringBuilder stringBuilder2 = new StringBuilder(result2);
                char c = stringBuilder2.charAt(0);
                stringBuilder2.deleteCharAt(0);
                stringBuilder2.insert(result2.length() - 2,c);
                result2 = stringBuilder2.toString().trim();
                result = result + result2;
            }
            inputString = sb.delete(0,sz).toString();
            dlina = inputString.length();
            sum = 0;
            buf = 0;

        }

        return result;
    }
}






