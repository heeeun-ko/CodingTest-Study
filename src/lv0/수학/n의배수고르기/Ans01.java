package lv0.수학.n의배수고르기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ans01 {
    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] answer = solution(n, numlist);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int n, int[] numlist) {

        List<Integer> answer = new ArrayList<>();

        // 나머지가 0인 경우 배수로 판단 -> List에 추가
        for (int num : numlist) {
            if (num % n == 0) {
                answer.add(num);
            }
        }

        int[] result = answer.stream().mapToInt(Integer::intValue).toArray();

        return result;
    }
}
