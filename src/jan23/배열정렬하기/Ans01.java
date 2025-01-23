package jan23.배열정렬하기;

import java.util.Arrays;
import java.util.Scanner;

public class Ans01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 정수의 갯수는?");
        int n = sc.nextInt();

        System.out.println("정렬할 정수를 입력하세요");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] sort = solution(arr);
        System.out.println(Arrays.toString(sort));
    }

    public static int[] solution(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
