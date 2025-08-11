package lv2.배열.최댓값최솟값;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ans01 {
    public static void main(String[] args) {
        String s = "1 2 3 4";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String[] strArray = s.split(" ");

        List<Integer> intList = Arrays.stream(strArray).map(Integer::parseInt).collect(Collectors.toList());

        int max = Collections.max(intList);
        int min = Collections.min(intList);

        String answer = min + " " + max;
        return answer;
    }
}
