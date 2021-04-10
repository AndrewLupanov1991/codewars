package code;

import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder sb = new StringBuilder();
        String buf;
        for (int i = 0; i <binary.size() ; i++) {
            buf = String.valueOf((Integer) binary.get(i));
            sb.append(buf);
        }


        int number = Integer.parseInt(sb.toString());


        return Integer.parseInt(sb.toString(), 2);
    }

}