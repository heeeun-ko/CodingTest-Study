package lv2.스택.짝지어제거하기;

import java.util.Stack;

public class Ans01 {
    public static void main(String[] args) {
        String s = "cdcd";
        System.out.println(solution(s));
    }

    static int solution(String s) {
        int res = 0;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.empty()) {
                stack.push(c);
            } else if (c == stack.peek()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        if (stack.empty()) {
            res = 1;
        }
        return res;
    }
}
