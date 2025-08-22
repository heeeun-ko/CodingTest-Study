package lv0.배열.약수구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ans01 {
    public static void main(String[] args) {
        int n = 24;
        int[] answer = solution(n);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int n) {

        List<Integer> intList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                intList.add(i);
            }
        }

        int[] answer = intList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
