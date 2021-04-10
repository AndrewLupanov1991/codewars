package code;

public class FindOutlier{
    static int find(int[] integers) {
        int counter = 0;
        int buf;
        int number;

        for (int i = 0; i < 3;i++){
            buf = integers[i];
            if (buf % 2 == 0) {
                counter++;
        }

        }
        if (counter > 1) {
            for (int i = 0; i < integers.length; i++){
                number = integers[i];
                if (number % 2 != 0) {
                    return number;
                }
            }
        }else if(counter < 2) {
            for (int i = 0; i < integers.length; i++){
                number = integers[i];
                if (number % 2 == 0) {
                    return number;
                }
            }

        }
        return 0;
    }

}





