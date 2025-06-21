package lv0.배열.배열회전시키기;

import java.util.Arrays;

public class Ans01 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        String direction = "right";
        System.out.println(Arrays.toString(solution(numbers, direction)));
    }

    private static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        switch (direction) {
            case "right":
                answer[0] = numbers[numbers.length - 1];
                System.arraycopy(numbers, 0, answer, 1, numbers.length - 1);
                break;

            case "left":
                answer[numbers.length - 1] = numbers[0];
                System.arraycopy(numbers, 1, answer, 0, numbers.length - 1);
                break;
        }

        return answer;
    }
}
