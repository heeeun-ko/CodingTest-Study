package lv0.배열.최댓값만들기1;

import java.util.Arrays;

public class Ans01 {
    public static void main(String[] args) {
        int[] numbers = {0, 31, 24, 10, 1, 9};
        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        int answer = numbers[length - 1] * numbers[length - 2];
        return answer;
    }
}
