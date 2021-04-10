package code;

public class Line {
    public static String Tickets(int[] peopleInLine)
    {

        if (peopleInLine.length < 2) {
            return "YES";
        }
        int sum = peopleInLine[0];
      for (int i = 1; i < peopleInLine.length; i++) {
          if (peopleInLine[i] % 25 != 0) {
              return "NO";
          }

          if (peopleInLine[i]== 25) {
              sum=sum+peopleInLine[i];
          }
          if(peopleInLine[i]!= 25) {
              sum = sum - peopleInLine[i];
          }
          if (sum < 0) {
              return "NO";
          }
          if (sum == 0 && i != peopleInLine.length) {
              continue;
          }


      }
      return "YES";

    }
}
