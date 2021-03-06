package Leetcode.easy;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *  
 * An input string is valid if:
 *  
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *  
 * Example 1:
 *  
 * Input: "()"
 * Output: true
 * Example 2:
 *  
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 *  
 * Input: "(]"
 * Output: false
 * Example 4:
 *  
 * Input: "([)]"
 * Output: false
 * Example 5:
 *  
 * Input: "{[]}"
 * Output: true
 *  
 * Created by Dennis on 2018/12/28.
 */
public class Problem20ValidParentheses {
    /**
     * 思路：用Stack的特性
     * @param s 输入字符串
     * @return boolean
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()";
        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "([)]";
        String s4 = "{[]}";
        System.out.println(isValid(s));
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        System.out.println(isValid(s4));
    }

}
