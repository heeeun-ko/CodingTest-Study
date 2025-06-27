package lv0.배열.소인수분해;

import java.util.ArrayList;
import java.util.List;

public class Ans01 {
    public static void main(String[] args) {
        int n = 12;
        solution(n);
    }

    public static int[] solution(int n) {
        List<Integer> intList = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                intList.add(i);
            }
        }

        int[] answer = intList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
