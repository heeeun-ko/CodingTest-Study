package lv0.배열.가장큰수찾기;

import java.util.Arrays;

public class Ans01 {
    public static void main(String[] args) {
        int[] array = {9, 10, 11, 8};
        int[] answer = solution(array);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] array) {
        int[] answer = {array[0], 0};

        for (int i = 1; i < array.length; i++) {
            if (answer[0] < array[i]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }
}
