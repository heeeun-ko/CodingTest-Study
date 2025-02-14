package feb13.변환10진수to2진수;

import java.util.Stack;

public class Ans01 {
    public static void main(String[] args) {
        Integer decimal = 500;

        Stack<Integer> stack = solution(decimal);
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i));
        }
    }

    static Stack<Integer> solution(Integer decimal) {
        Stack<Integer> stack = new Stack<>();
        while (decimal > 1) {
            Integer result = decimal % 2;
            stack.push(result);
            decimal /= 2;
        }
        stack.push(decimal);

        return stack;
    }
}
