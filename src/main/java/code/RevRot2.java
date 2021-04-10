package code;

public class RevRot2 {
    public static String revRot2(String strng, int sz) {
        if (strng.equals("") || sz <= 0 || sz > strng.length()) {
            return "";
        }
        String result = new String();
        String inputString = strng;
        StringBuilder sb = new StringBuilder(inputString);
        int dlina = inputString.length();
        if (sz > dlina){
            result=result + new String("");
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
