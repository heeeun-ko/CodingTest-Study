package lv2.트리.하노이의탑;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ans02 {
    public static void main(String[] args) {
        int n = 2;
        int[][] arr = solution(n);
        System.out.println(Arrays.deepToString(arr));
    }

    static List<int[]> arr = new ArrayList<>();

    static int[][] solution(int n) {
        hanoi(n, 1, 2, 3);
        int[][] ans = arr.stream().toArray(int[][]::new);
        return ans;
    }

    static void hanoi(int n, int start, int temp, int end) {
        if (n == 0) {
            return;
        }

        hanoi(n - 1, start, end, temp);
        arr.add(new int[]{start, end});
        hanoi(n - 1, temp, start, end);
    }
}
