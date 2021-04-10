package code;

public class Kata1 {
    public static int[] DataReverse(int[] data) {
        int[] result = new int[data.length];
        int index = 0;

        int digit = data.length - 8;
        while (index!=data.length) {
            for (int i = digit; i < digit + 8; i++) {
                result[index++] = data[i];
            }
            digit = digit - 8;
        }

        return result;
        }


    }


