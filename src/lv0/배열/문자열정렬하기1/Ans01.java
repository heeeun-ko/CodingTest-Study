package lv0.배열.문자열정렬하기1;

import java.util.Arrays;

public class Ans01 {
    public static void main(String[] args) {
        String my_string = "hi12392";
        System.out.println(Arrays.toString(solution(my_string)));
    }

    public static int[] solution(String my_string) {
        String intStr = my_string.replaceAll("[^0-9]", "");
        int[] result = Arrays.stream(intStr.split(""))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        return result;
    }
}
