package lv0.배열.진료순서정하기;

import java.util.Arrays;
import java.util.HashMap;

public class Ans01 {
    public static void main(String[] args) {
        int[] emergency = {30, 10, 23, 6, 100};
        int[] answer = Solution.solution(emergency);
        System.out.println(Arrays.toString(answer));
    }
}

class Solution {
    public static int[] solution(int[] emergency) {
        int[] emergencyCopy = emergency.clone();
        HashMap<Integer, Integer> sorting = new HashMap<>();

        for (int i = 0; i < emergency.length; i++) {
            for (int j = i + 1; j < emergency.length; j++) {
                if (emergency[i] < emergency[j]) {
                    int temp = emergency[i];
                    emergency[i] = emergency[j];
                    emergency[j] = temp;
                }
            }
        }

        int v = 1;
        for (int e : emergency) {
            sorting.put(e, v);
            v++;
        }

        int[] answer = new int[emergency.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = sorting.get(emergencyCopy[i]);

        }

        return answer;
    }
}
