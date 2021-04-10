package start;

public class JadenCase {

    public static String toJadenCase(String phrase) {
        if(phrase == null || phrase.equals("")) {
            return null;
        }
        char[] chars = phrase.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == ' ') {
                chars[i] = Character.toUpperCase(chars[i]);
            }

        }

        return new String(chars);
    }
}
