package start;

import java.util.ArrayList;
import java.util.List;

public class EnoughIsEnough {

    public static Integer[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> list = new ArrayList<>();
        int elem;
        int counter;

        for (int i = 0; i < elements.length; i++) {
            counter = 0;
            elem = elements[i];
            for (int j = 0; j < list.size(); j++) {
                if (elem == list.get(j)){
                    counter = counter + 1;
                }
            }
            if (counter < maxOccurrences) {
                list.add(elem);
            }
        }

        return list.toArray(new Integer[list.size()]);
    }
}