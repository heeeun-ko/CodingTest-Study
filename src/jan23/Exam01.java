package jan23;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] solution(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}

public class Exam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 정수의 갯수는?");
        int n = sc.nextInt();

        System.out.println("정렬할 정수를 입력하세요");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        int[] sort = solution.solution(arr);
        System.out.println(Arrays.toString(sort));
    }
}
