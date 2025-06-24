package lv1.배열.k번쨰수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ans01 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution(array, commands)));
    }

    public static int[] solution(int[] array, int[][] commands) {
        List<Integer> answerList = new ArrayList<>();

        for (int[] command : commands) {
            int[] sortList = Arrays.stream(array)
                    .skip(command[0] - 1)
                    .limit(command[1] - command[0] + 1)
                    .sorted()
                    .toArray();
            answerList.add(sortList[command[2] - 1]);
        }

        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
