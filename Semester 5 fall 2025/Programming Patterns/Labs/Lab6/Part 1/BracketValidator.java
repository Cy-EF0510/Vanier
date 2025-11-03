import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.HashMap;

public class BracketValidator {
    public static void main(String[] args) {
        String expression1 = "a + b * {c - (d / e)}";
        String expression2 = "a + [b * (c - d})]";
        System.out.println(" Expression 1 is balanced : " + isBalanced(expression1));
        System.out.println(" Expression 2 is balanced : " + isBalanced(expression2));
    }

    public static boolean isBalanced ( String expression ) {
        // Use a Map to store the matching pairs
        Map < Character , Character > bracketPairs = new HashMap < >() ;
        bracketPairs.put(')', '(');
        bracketPairs.put(']', '[');
        bracketPairs.put('}','{');
        // Use a Deque as a Stack
        Deque<Character> stack = new ArrayDeque < >() ;

        for (char c : expression.toCharArray()){
            // If it 's an opening bracket , push it onto the stack
            if ( bracketPairs.containsValue(c)){
                
            }
            // If it 's a closing bracket
            else if ( bracketPairs . containsKey ( c ) ) {
                // If stack is empty or the top doesn 't match , it 's unbalanced
                if ( stack.isEmpty () || stack.peek() != bracketPairs.get(c)) {
                    return false;
                }
                // If it matches , pop the opening bracket
                stack.pop();
            }
        }
        // If the stack is empty at the end , all brackets were matched
        return stack.isEmpty();
    }
}