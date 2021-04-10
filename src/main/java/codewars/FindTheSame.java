package codewars;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class FindTheSame {
    public static void main(String[] args) {
        String s = "[()]";
     System.out.println(FindTheSame.isValid(s));

    }

    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i <s.length() ; i++) {
            char buf = s.charAt(i);
            if (!map.containsKey(buf)) {
                stack.push(buf);
            }
            else {
                char top = stack.isEmpty() ? '?' : stack.pop();
                if (top!= map.get(buf)) {
                    return false;
                }
            }

        }
        return stack.isEmpty();


    }
}
