package code;

public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        int speed1 = v1;
        int speed2 = v2;
        int difference = speed2 - speed1;
        int[] array = new int[3];
        int countOfSeconds = (g * 3600) / difference;
        array[0] = countOfSeconds / 3600;
        array[1] = countOfSeconds - (array[0] * 3600);
        array[1] = array[1] / 60;
        array[2]= countOfSeconds - (array[0] * 3600 + array[1] * 60);

        return array;
    }
}
