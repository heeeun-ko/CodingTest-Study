package lv0.해시.가까운수;

import java.util.Arrays;

public class Ans02 {
    public static void main(String[] args) {
        int[] array = {3, 10, 28};
        int n = 20;
        System.out.println(solution(array, n));
    }

    public static int solution(int[] array, int n) {
        Arrays.sort(array);

        int answer = 0;
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(n - array[0]) > Math.abs(n - array[i])) {
                array[0] = array[i];
            }
        }
        answer = array[0];
        return answer;
    }
}
