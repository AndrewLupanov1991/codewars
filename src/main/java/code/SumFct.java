package code;

import java.math.BigInteger;
public class SumFct
{
    public static BigInteger perimeter(BigInteger n)
    {
        BigInteger solution = new BigInteger("2");
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("0");

        for(int i = 1; i <= n.intValue(); i++)
        {
            solution = solution.add(c);
            c = a.add(b);
            a = b;
            b = c;
        }

        return solution.multiply(BigInteger.valueOf(4));
    }
}