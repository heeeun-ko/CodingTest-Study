package lv0.배열.배열제어하기;

import java.util.Arrays;
import java.util.Collections;

public class Ans01 {
    public static int[] solution(int[] arr) {
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 1, 4, 3, 7, 7, 3, 58};

        int[] arrResult = solution(arr);
        System.out.println(Arrays.toString(arrResult));
    }
}