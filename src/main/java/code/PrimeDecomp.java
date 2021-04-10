package code;

import java.util.ArrayList;
import java.util.List;

public class PrimeDecomp {

    public static String factors(int n) {
    int splitter = 0;
    int[] simpleDigits = new int[]{ 2, 3, 5, 7, 11, 13, 17, 19, 23,29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103,};
    int index = 0;
    int counter = 0;

    StringBuilder sb = new StringBuilder("(");
    while (n != simpleDigits[index]) {

        if (n % simpleDigits[index] == 0) {
            n = n / simpleDigits[index];
            counter++;
        }
        if (counter == 1) {
            sb.append(simpleDigits[index]);
        }


        if (counter == 2) {
            sb.append("**");
        }
        if (counter == 0){
            index++;
            continue;
        }
        else if(n % simpleDigits[index] != 0) {
            if (counter > 1) {
                sb.append(counter);
            }

            sb.append(')');
            sb.append('(');
            index=0;
            counter=0;
        }
    }

    return sb.append(n).append(')').toString();


    }


    }


