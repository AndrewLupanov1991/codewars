package code;

public class Xbonacci {

    public static double[] tribonacci(double[] s, int n) {
        if( n == 0 )
            return new double[0];
        double[] res = new double[n];
        for( int i = 0; i < n; i++ ) {
            if( i < 3 )
                res[i] = s[i];
            else
                res[i] = res[i-1]+res[i-2]+res[i-3];
        }
        return res;
    }
}