package code;

public class SquareDigit {

    public static int squareDigits(int n) {
        if (n < 1) {
            return n;
        }
        int result2 = 0;
        int buf = 0;
        String result = "";
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        for(Character c : chars) {
            buf = Character.getNumericValue(c) * Character.getNumericValue(c);
            result = result + Integer.toString(buf);

        }
        result2 = Integer.parseInt(result);
        return result2;


    }





}