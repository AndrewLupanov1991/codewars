package code;

import java.util.Arrays;

class MinMax {
    public static int[] minMax(int[] arr) {
        if (arr.length < 2) {
            int num = arr[0];
            int[] mas = new int[2];
            mas[0] = num;
            mas[1] = num;
            return mas;
        }
        Arrays.sort(arr);
        int[] minMax = new int[2];
        minMax[0] = arr[0];
        minMax[1] = arr[arr.length - 1];
        return  minMax;
    }
}