package lv0.배열.공던지기;

public class Ans02 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int k = 2;
        System.out.println(solution(numbers, k));
    }

    public static int solution(int[] numbers, int k) {
        int answer = (k - 1) * 2 % numbers.length + 1;

        return answer;
    }
}