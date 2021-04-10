package start;

import java.util.Random;

public class Array {
    public static Integer[] getUniqNumber(Integer[] array) {
        Integer[] result = new Integer[array.length];
        result[0] = array[0];
        int elem;
        int counter = 1;
        boolean isNewNumber = true;
        for (int i = 1; i < array.length; i++) {
            elem = array[i];
            for (int j = 0; j < counter; j++) {
                if(elem == result[j]) {
                    isNewNumber = false;
                    break;
                }


            }
            if (isNewNumber) {
                result[counter++] = elem;
            }
            isNewNumber = true;

        }
        return result;

    }


}
