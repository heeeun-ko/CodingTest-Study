package feb13.주가격;

// 93.3 / 100.0점

import java.util.Arrays;
import java.util.Stack;

public class Ans01 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};

        int[] result = solution(prices);
        System.out.println(Arrays.toString(result));
    }

    static int[] solution(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = i; j < prices.length; j++) {
                if (stack.isEmpty()) {
                    stack.push(prices[j]);
                } else if (prices[j] >= prices[i]) {
                    stack.push(prices[j]);
                } else if (stack.peek() < prices[i]) {
                    break;
                }
            }
            result[i] = stack.size() - 1;
        }
        return result;
    }
}