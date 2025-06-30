package lv0.해시.가까운수;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Ans01 {
    public static void main(String[] args) {
        int[] array = {3, 10, 28};
        int n = 20;
        System.out.println(solution(array, n));
    }

    public static int solution(int[] array, int n) {
        HashMap<Integer, Integer> abs = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            abs.put(array[i], Math.abs(array[i] - n));
        }

        return Collections.min(abs.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
