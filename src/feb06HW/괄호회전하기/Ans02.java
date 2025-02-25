package feb06HW.괄호회전하기;

import java.util.Stack;

public class Ans02 {
    public static void main(String[] args) {
        String s = "{[}]";
        System.out.println(solution(s));
    }

    static int solution(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            String rotateStr = s.substring(i) + s.substring(0, i);
            if (correctSolution(rotateStr)) {
                result++;
            }
        }

        return result;
    }

    static boolean correctSolution(String rotateStr) {
        boolean flag = true;

        Stack<Character> stackA = new Stack<>();
        Stack<Character> stackB = new Stack<>();
        Stack<Character> stackC = new Stack<>();

        for (char c : rotateStr.toCharArray()) {
            switch (c) {
                case '[':
                    stackA.push(c);
                    break;
                case ']':
                    if (stackA.empty()) {
                        flag = false;
                        break;
                    }
                    stackA.pop();
                    break;

                case '{':
                    stackB.push(c);
                    break;
                case '}':
                    if (stackB.empty()) {
                        flag = false;
                        break;
                    }
                    stackB.pop();
                    break;

                case '(':
                    stackC.push(c);
                    break;
                case ')':
                    if (stackC.empty()) {
                        flag = false;
                        break;
                    }
                    stackC.pop();
                    break;
            }
        }
        if (stackA.size() != 0 || stackB.size() != 0 || stackC.size() != 0) {
            flag = false;
        }
        stackA.clear();
        stackB.clear();
        stackC.clear();

        return flag;
    }
}