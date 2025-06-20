package lv0.배열.이차원으로만들기;

import java.util.Arrays;

public class Ans02 {
    public static void main(String[] args) {
        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n = 3;
        int[][] answer = solution(num_list, n);
        System.out.println(Arrays.deepToString(answer));
    }

    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        for (int i = 0; i < num_list.length; i++) {
            answer[i / n][i % n] = num_list[i];
        }

        return answer;
    }
}
