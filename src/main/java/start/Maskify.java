package start;

public class Maskify {
    public static String maskify(String str) {
        char[]chars = str.toCharArray();
        if(chars.length == 4) {
            return str;
        }
        for (int i = 0; i < chars.length - 4; i++) {
            chars[i] = '#';

        }
        return new String(chars);

    }

}

