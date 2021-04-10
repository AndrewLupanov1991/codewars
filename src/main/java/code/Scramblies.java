package code;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        StringBuilder sb = new StringBuilder(str1);
        char[] input2 = str2.toCharArray();
        char buf = ' ';
        int counter = 0;
        int counter2 = 0;
        for (int i = 0; i < input2.length;i++) {
            counter2++;
            buf = input2[i];
            for(int j = 0; j < sb.length();j++) {
                if (buf == sb.charAt(j)) {
                    counter++;
                    sb.deleteCharAt(j);
                    break;
                }

            }
        }
        return counter == counter2;




    }

}
