package code;

public class CounterOfStrong {
    public static int getSum(String string) {
        int input = Integer.parseInt(string);
        int sum = 0;
        int buf;

        while (input > 10) {
            buf = input % 10;
            sum+=buf;
            input = input / 10;
        }
        return sum + input;

    }
}
