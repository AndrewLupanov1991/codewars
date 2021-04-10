package code;

public class Validate {
    public static boolean validate(String n) {
        if(n.isEmpty()){
            return false;
        }
        char[] chars = n.toCharArray();
        int[] result = new int[n.length() + (n.length() / 2)];
        if (chars.length % 2 == 0) {
            int buf;
            int count = 0;
            int sum = 0;
            for (int i = 0; i < chars.length; i++) {
                buf = Character.getNumericValue(chars[i]);
                if (i % 2 != 0) {
                    buf = buf * 2;}
                    if (buf > 9) {
                    if (buf ==10) {
                        sum = 1;
                    }else if(buf == 12) {
                        sum = 3;
                    }else  if(buf == 14) {
                        sum = 5;
                    }else if(buf == 16) {
                        sum = 7;
                    }else if (buf == 18) {
                        sum = 9;
                    }
                    result[i] = sum;
                    continue;
                }
                result[i] = buf;
            }
            for(Integer i : result) {
                count = count + i;
            }
            if (count % 10 == 0) {
                return true;
            }
        }
        return false;
    }

}