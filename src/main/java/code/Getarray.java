package code;

import java.util.ArrayList;
import java.util.List;

public class Getarray {
    public static  Object[] getUniqNumber (int [] array) {

        List<Integer>result = new ArrayList<>();
        result.add(array[0]);
        int buf;

        for (int i = 0; i < array.length;i++) {
            buf = array[i];
            for (int j = 0; j < result.size();j++) {
                if (result.contains(buf)) {
                    continue;
                }else {
                    result.add(buf);
                }

            }

        }
        return result.toArray();
    }
}
