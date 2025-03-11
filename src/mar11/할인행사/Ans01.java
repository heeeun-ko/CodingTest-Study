package mar11.할인행사;

import java.util.HashMap;

public class Ans01 {
    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice",
                "pot", "banana", "apple", "banana"};

        int res = solution(want, number, discount);
        System.out.println(res);
    }

    static int solution(String[] want, int[] number, String[] discount) {
        int res = 0;
        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        for (int i = 0; i < discount.length - 9; i++) {
            HashMap<String, Integer> discountMap = new HashMap<>();

            for (int j = i; j < i + 10; j++) {
                if (wantMap.containsKey(discount[j])) {
                    discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
                }
            }
            if (discountMap.equals(wantMap)) {
                res++;
            }
        }
        return res;
    }
}
