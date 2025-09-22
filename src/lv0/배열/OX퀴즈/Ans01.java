package lv0.배열.OX퀴즈;

import java.util.Arrays;

public class Ans01 {
    public static void main(String[] args) {
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        String[] answer = solution(quiz);
        System.out.println(Arrays.toString(answer));
    }

    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] cal = quiz[i].split(" ");
            int a = Integer.parseInt(cal[0]);
            int b = Integer.parseInt(cal[2]);
            int c = Integer.parseInt(cal[4]);
            if (cal[1].equals("+")) {
                if (a + b == c) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if (a - b == c) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }

        return answer;
    }
}