package fither;

public class BraceChecker {

    public static boolean isValid(String braces) {
        char[] chars = braces.toCharArray();
        if (isOddSize(chars)) {
            return false;
        }
        char leftBracket;
        char rightBracket;
        for (int i = 0; i < chars.length / 2; i++) {
            leftBracket = chars[i];
            rightBracket = chars[chars.length - i - 1];
            if (isNotOpeningBracket(leftBracket) || isBracketNotClosedCorrectly(leftBracket, rightBracket)) {
                return false;
            }
        }

       return true;
    }

    private static boolean isOddSize(char[] chars) {
        return chars.length % 2 == 1;
    }

    private static boolean isBracketNotClosedCorrectly(char leftBracket, char rightBracket) {
        return leftBracket == '(' && rightBracket != ')' ||
                leftBracket == '[' && rightBracket != ']' ||
                leftBracket == '{' && rightBracket != '}';
    }

    private static boolean isNotOpeningBracket(char leftBracket) {
        return leftBracket == ']' || leftBracket == '}' || leftBracket == ')';
    }

}