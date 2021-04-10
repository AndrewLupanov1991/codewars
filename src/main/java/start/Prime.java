package start;

public class Prime {
    public static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }
        int countSeparate = 0;
        for (int i = 1; i <= num; i++) {
           if(num % i == 0 ) {
               countSeparate = countSeparate + 1;
           }
           if (countSeparate > 2) {
               return false;
           }
        }

        return true;

    }
}