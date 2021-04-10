package codewars;

public class BinarSearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 22, 29};

        System.out.println(BinarSearch.getDigit(array, 29));

    }


    public static int getDigit(int[] array, int elem) {

        int low = 0, high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (elem < array[middle]) {
                high = middle - 1;
            } else if (elem > array[middle]) {
                low = middle + 1;

            } else {
                return middle;
            }



        }
        return -1;
    }
}






