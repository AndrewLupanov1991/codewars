package code;

public class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {             //(1500000, 2.5, 10000, 2000000), 10);
        int countOfResident = p0;

        int per = 0;

        int addForYear = aug;
        int resultCount = p;
        int countOfYear = 0;

        while (countOfResident <= resultCount) {
            per = (int) (countOfResident /100 * percent);
            countOfResident = countOfResident + per + addForYear;
            countOfYear++;

        }
        return countOfYear;

        }









}
