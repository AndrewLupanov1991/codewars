package code;


public class Thirteen {

    public static long thirt(long n) {
        if (n < 100) {
            return n ;
        }
        int[] array = new int[]{1, 10, 9, 12, 3, 4,1};
        String input = Long.toString(n);
        int result = 0;
        int j = 0;
        int buf = 0;
        for (int i = input.length() - 1; i >=0;i--) {
            if (j == 6) {
                j=0;
            }
            buf = Character.getNumericValue(input.charAt(i));
            result = result + buf * array[j++];
        }
        j=0;
        while (result >= 100) {
            String res = Integer.toString(result);
            int b = 0;
            int buf2 = 0;
            for (int k = res.length() - 1; k >=0;k--) {
                if (j == 6) {
                    j=0;
                }
                buf2 = Character.getNumericValue(res.charAt(k));
                b = b + buf2 * array[j++];

            }
            result = b;

        }
        return result;




    }
}



