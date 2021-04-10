package fither;

public class Kata1 {


    public static String encrypt(final String text) {
        if (text.equals(" ")) {
            return text;
        }
        char[] chars = new char[text.length()];
        char[] chars1 = text.toCharArray();
        char symbol;
        int counter = 0;
        if ( chars1.length % 2 != 0) {
            for (int i = 0; i < chars1.length - 1; i=i+2) {
                symbol = chars1[i];
                chars[counter] = symbol;
                counter = counter + 1;
            }

            for (int i = 1; i <chars1.length; i = i+2) {
                symbol = chars1[i];
                chars[counter] = symbol;
                counter = counter + 1;
            }
        }
       /* if ( chars1.length % 2 == 0) {
            for (int i = 0; i < chars1.length - 1; i=i+2) {
                symbol = chars1[i];
                chars[counter] = symbol;
                counter = counter + 1;
            }
            

        }*/
        return new String(chars);

        }


}