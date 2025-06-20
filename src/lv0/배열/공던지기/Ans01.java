package lv0.배열.공던지기;

public class Ans01 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int k = 2;
        System.out.println(solution(numbers, k));
    }

    public static int solution(int[] numbers, int k) {
        int answer = 0;

        int start = 0;
        for (int i = 1; i <= k; i++) {
            answer = numbers[start];
            start += 2;
            if (start >= numbers.length) {
                start -= numbers.length;
            }
        }

        return answer;
    }
}
