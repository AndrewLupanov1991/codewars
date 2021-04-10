package fither;

public class Square {
    public static int getMinMean(int a, int b) {
        if (a < 2 || b < 2) {
            return a * b;
        }
        int result = 0;
        if (a > b) {
            return getMinMean(a - b, b) + 1;
        }
        if (b > a) {
            return getMinMean( b - a, a) + result + 1;
        }
        return result;
    }

    public static int getNumber(int a, int b) {
        if (a == b) {
            return 1;
        }
        if (a < 2 || b < 2) {
            return a * b;
        }
        int result = 0;

        while (a != 1 && b != 1 && a!=b) { //   !(a == 1 || b == 1)
            if (a > b) {
                a = a - b;
                result = result + 1;

                result = myMean(a, b, result);


            }
            if (b > a) {

                b = b - a;
                result = result +1;
            }
            result = myMean(a, b, result);
        }
        return result;
    }

    private static int myMean(int a, int b, int result) {
        if (a == 1 || b == 1) {
            result = (a * b) + result;
            return result;
        }

        return result;
    }

    public static int solution(int a, int b) {
        if (a == b) {
            return 1;
        }

        int result = 0;

        while (a > 1 || b > 1) {
            if (a > b) {
                result = result + a / b;
                a = a % b;
            } else if (b > a) {
                result = result + b / a;
                b = b % a;
            }
        }
        result = result + a * b;
        return result;
    }
}
