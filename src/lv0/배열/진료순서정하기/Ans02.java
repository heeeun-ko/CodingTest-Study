package lv0.배열.진료순서정하기;

import java.util.Arrays;

public class Ans02 {
    public static void main(String[] args) {
        int[] emergency = {30, 10, 23, 6, 100};
        int[] answer = solution(emergency);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            if (answer[i] != 0) {
                continue;
            }

            int idx = 1;
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j]) {
                    idx++;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }
}
