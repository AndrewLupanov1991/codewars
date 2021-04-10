package code;
public class DeadFish {
    public static int[] parse(String data) {
       int counter = 0;
       for (int i = 0; i < data.length(); i++) {
           if (data.charAt(i) == 'o') {
               counter++;
           }
    }
       int[] result = new int[counter];
       int digit = 0;
       int index = 0;
       for (int i = 0; i < data.length();i++) {
           if (data.charAt(i) == 'i') {
               digit = digit + 1;
           }else if (
                   data.charAt(i) == 'd'
           ){
               digit = digit - 1;
           }else if (data.charAt(i) == 's'){
               digit = digit*digit;
           }else if(data.charAt(i) == 'o') {
               result[index++] = digit;
           }else {
               continue;
           }

       }
       return result;

       }
}
