package start;

import java.util.Arrays;

public class CreateArray {

    public static Integer[][] array(int number) {
        if (number == 0) {
            return null;
        }

        Integer[][] mas = new Integer[number][];

        for (int i = 1; i < mas.length; i++) {
            mas[i] = new Integer[i];

            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = i;
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        return mas;
    }
    public static void iterator(){
        for (int i = 0; i<3;i++){
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k <3 ; k++) {

                    System.out.println(" i= " + i + " j= " + j + " k= " + k);
                }
            }
        }
        System.out.println("Конец цикла");

    }
    public static int sum () {
        Integer[][] array = {{1,2,3},{2,1,2,5,4,3},{5,4,7}};
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j <array[i].length ; j++) {
                sum = array[i][j] + sum;
            }
        }
        return sum;
    }

}



