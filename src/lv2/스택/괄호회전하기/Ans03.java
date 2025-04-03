package lv2.스택.괄호회전하기;

import java.util.Stack;

public class Ans03 {
    public static void main(String[] args) {
        String s = "[](){}";
        System.out.println(solution(s));
    }

    static int solution(String s) {
        int reuslt = 0;
        for (int i = 0; i < s.length(); i++) {
            String rotateStr = s.substring(i) + s.substring(0, i);
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < rotateStr.length(); j++) {
                char c = rotateStr.charAt(j);
                if (stack.isEmpty()) {
                    stack.push(c);
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            if (stack.isEmpty()) {
                reuslt++;
            }
        }
        return reuslt;
    }
}
