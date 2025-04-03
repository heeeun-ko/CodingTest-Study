package lv2.스택.주식가격;

import java.util.Arrays;
import java.util.Stack;

public class Ans03 {
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
                if (prices[i] <= prices[j]) {
                    stack.push(prices[i]);
                } else {
                    if (i != prices.length - 1) {
                        stack.push(prices[i]);
                    }
                    break;
                }
            }
            result[i] = stack.size() - 1;
        }
        return result;
    }
}
