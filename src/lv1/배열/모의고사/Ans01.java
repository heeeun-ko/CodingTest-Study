package lv1.배열.모의고사;

import java.util.ArrayList;
import java.util.List;

public class Ans01 {
    static List<Integer> solution(int[] answer) {

        int[] math1 = {1, 2, 3, 4, 5};
        int[] math2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] math3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] correctScore = {0, 0, 0};
        correctScore[0] = CorrectScoreCount(answer, math1);
        correctScore[1] = CorrectScoreCount(answer, math2);
        correctScore[2] = CorrectScoreCount(answer, math3);

        int maxScore = Math.max(correctScore[0], Math.max(correctScore[1], correctScore[2]));

        List<Integer> maxScoreList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (maxScore == correctScore[i]) {
                maxScoreList.add(i + 1);
            }
        }
        return maxScoreList;
    }

    static int CorrectScoreCount(int[] answer, int[] math) {
        int score = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == math[i]) {
                score++;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        int[] answer = {1, 3, 2, 4, 2};
        System.out.println(solution(answer));
    }
}
