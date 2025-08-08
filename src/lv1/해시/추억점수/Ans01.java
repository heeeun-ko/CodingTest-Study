package lv1.해시.추억점수;

import java.util.Arrays;
import java.util.HashMap;

public class Ans01 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}};

        int[] result = solution(name, yearning, photo);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> score = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            score.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                answer[i] += score.getOrDefault(photo[i][j], 0);
            }
        }

        return answer;
    }
}
