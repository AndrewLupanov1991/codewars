package code;

import java.util.ArrayList;
import java.util.List;

public class RemovedNumbers {
    public static List<long[]> removNb(long n) {
        long num1 =0;
        long num2 =0 ;
        int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            for (int j = 1; j<= n; j++) {
                num1 = j;
                for (int k = j+1; k <=n;k++) {
                    num2 = k;
                    if (sum - num1 - num2 == num1*num2) {
                        List<long[]> res = new ArrayList<>();
                        res.add(new long[] {num1, num2});
                        res.add(new long[] {num2, num1});
                        return res;

                    }
                }

            }
        return new ArrayList<>();
    }
}
