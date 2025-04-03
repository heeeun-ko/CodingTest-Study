package lv2.배열.n2배열자르기;

import java.util.Arrays;

// 메모리 초과 -> n이 10^7이면, n^2이 int 범위를 넘어가서 Overflow

public class ans01 {
    static int[] solution(int n, long left, long right) {
        int[][] arr2 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = (i > j ? i + 1 : j + 1);
            }
        }

        int[] arr = new int[n * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[index++] = arr2[i][j];
            }
        }

        return Arrays.copyOfRange(arr, (int) left, (int) right + 1);
    }

    public static void main(String[] args) {
        int n = 4;
        long left = 7;
        long right = 14;

        int[] result = solution(n, left, right);
        System.out.println(Arrays.toString(result));
    }
}
