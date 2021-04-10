package code;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
       if (walk.length!=10) {
           return false;
       }

       char buf=' ';
       char buf2 = ' ';
      for (int i = 0; i < walk.length - 3; i=i+2) {
          buf = walk[i];
          buf2 = walk[i + 2];
          if (buf != buf2) {
              return false;
          }
      }
          for (int j = 1; j < walk.length -3; j=j+2) {
              buf = walk[j];
              buf2 = walk[j+2];
              if (buf!= buf2) {
                  return false;
              }
          }

        return true;
    }
}
