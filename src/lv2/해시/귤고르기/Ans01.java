package lv2.해시.귤고르기;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Ans01 {
    public static void main(String[] args) {
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(solution(k, tangerine));
    }

    public static int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> tanCount = new HashMap<>();
        for (int t : tangerine) {
            tanCount.put(t, tanCount.getOrDefault(t, 0) + 1);
        }

        int answer = 0;

        List<Integer> values = new ArrayList<>(tanCount.values());
        values.sort(Comparator.reverseOrder());

        for (int v : values) {
            k -= v;
            answer++;
            if (k <= 0) {
                break;
            }
        }

        return answer;
    }
}