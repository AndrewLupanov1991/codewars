package code;

public class Papapapa {
    public static String getString(String string) {
        String [] input = string.split(" ");
        StringBuilder sb = new StringBuilder();
         int result = 1;
         int inLength = input.length;
         int digit = 1;



         while (result<inLength) {
             for (int i = 0; i < input.length;i++) {
                 if(input[i].contains(Integer.toString(digit))) {
                     sb.append(input[i]);
                     sb.append(" ");
                     result++;
                     break;

                 }
             }
             digit++;
         }
         return sb.toString();
    }
    public static int reverse(int a) {
        StringBuilder stringBuilder = new StringBuilder(Integer.toString(a)).reverse();
        int result = Integer.parseInt(stringBuilder.toString());
        return result;
    }
}
