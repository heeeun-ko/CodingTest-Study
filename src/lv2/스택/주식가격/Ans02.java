package lv2.스택.주식가격;

// 배열 사용시.. 런타임 에러 발생

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ans02 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};

        int[] result = solution(prices);
        System.out.println(Arrays.toString(result));
    }

    static int[] solution(int[] prices) {
        int[] result = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = i; j < prices.length; j++) {
                if (prices[i] <= prices[j]) {
                    list.add(prices[i]);
                } else {
                    if (i != prices.length - 1) {
                        list.add(prices[i]);
                    }
                    break;
                }
            }
            result[i] = list.size() - 1;
        }
        return result;
    }
}
