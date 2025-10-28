import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "([)";

        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for(char ch : s.toCharArray()) {
             if(ch == '(' || ch == '{' || ch == '[') {
                 stack.push(ch);
             }

             if(ch == ')' || ch == '}' || ch == ']') {
                 if(stack.isEmpty()) {
                     return false;
                 }

                 char top = stack.pop();

                 if(ch == '}' && top != '{' || ch==')' && top != '(' || ch == ']' && top!= '[') {
                     return false;
                 }
             }
        }
        return (stack.isEmpty())?true:false;


    }
}
