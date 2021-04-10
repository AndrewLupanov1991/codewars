package fither;

public class Minimum {

    private static int counter = 1;

    public static int minValue(int[] values) {
        int[] mas = new int[values.length];
        getUniqueValues(values, mas);
        bubbleSort(mas);
        return getLowestPossibleNumber(mas);
    }

    public static void getUniqueValues(int[] values, int[] mas) {
        int buf;
        mas[0] = values[0];// [1,2,4,1,5];   [1,2,4,]
        boolean isNew = true;
        for (int i = 1; i < values.length;i++) {
            buf = values[i];//5
            for (int j = 0; j < counter; j++) {
                if (buf == mas[j]) {
                    isNew = false;
                    break;
                }
            }
            if (isNew) {
                mas[counter++] = buf;
            }
            isNew = true;
        }
    }

    private static void bubbleSort(int[] mas) {
        int buf;
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < counter - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
    }

    private static int getLowestPossibleNumber(int[] mas) {
        StringBuilder result = new StringBuilder();
        for (int b = 0; b < counter; b++) {
            result.append(mas[b]);
        }
        counter = 1;
        return Integer.parseInt(result.toString());
    }




    public static int[] findUniq(int[] mas) {
        int[] result = new int[mas.length];
        result[0] = mas[0];
        int index = 0;
        int elem;
        for (int i = 1; i <mas.length ; i++) {
            elem = mas[i];
            for (int j = 0; j < result.length; j++) {



            }
        }
        return mas;


    }

}