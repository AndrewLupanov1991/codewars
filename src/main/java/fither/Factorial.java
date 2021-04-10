package fither;

import java.util.HashMap;
import java.util.Map;

public class Factorial {
    public static Map<Integer, Integer> map = new HashMap<>();
    public int n;

    public Factorial(int n) {
        this.n = n;
    }

    public int fib() {
        if (n < 2) {
            return 1;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }

        n--;
        int prevFib = fib();
        n--;
        int prevPrevFib = fib();
        n += 2;
        int result = prevFib + prevPrevFib;
        map.put(n, result);
        return result;
    }

}
