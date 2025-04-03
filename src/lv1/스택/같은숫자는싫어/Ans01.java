package lv1.스택.같은숫자는싫어;

import java.util.Stack;

public class Ans01 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        System.out.println(solution(arr));
    }

    static Stack<Integer> solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || arr[i] != stack.peek()) {
                stack.push(arr[i]);
            }
        }
        return stack;
    }
}
