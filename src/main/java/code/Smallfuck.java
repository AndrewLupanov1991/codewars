package code;

public class Smallfuck {
    public static String interpreter(String code, String tape) {
       StringBuilder result = new StringBuilder(tape);
        char[] porol = code.toCharArray();
        char swap = ' ';
        int i = 0;

            for (int j = 0; j < porol.length;j++) {
                if (i > porol.length) {
                    return result.toString();
                }
              swap = porol[j];
                if (swap == '*') {
                    if (result.charAt(i) == '1') {
                        result.setCharAt(i,'0');

                        continue;
                    }else if (result.charAt(i) == '0') {
                        result.setCharAt(i,'1');
                        continue;
                    }
                }
                if(swap == '>') {
                    i++;
                    continue;
                }
                if (swap == '<') {
                    i--;
                    continue;
                }
            }

        return result.toString();
    }

}
