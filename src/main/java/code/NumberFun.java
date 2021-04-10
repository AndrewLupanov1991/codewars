package code;

public class NumberFun {
    public static long findNextSquare(long sq) {
        if (sq < 1) {
            return -1;
        }
        int in = (int) Math.sqrt(sq);
        if(in * in != sq) {
            return -1;
        }

        long result = 0;
        long buf = (int)Math.sqrt(sq);

        while (result < buf){
            for (long i = sq; i < sq + 1000000000;i++) {
                result = (int) Math.sqrt(i);
                if (result >= buf) {
                    return i;
                }

            }

        }

        return -1;


        }




    }


