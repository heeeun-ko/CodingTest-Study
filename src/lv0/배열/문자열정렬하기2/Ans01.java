package lv0.배열.문자열정렬하기2;

import java.util.Arrays;

public class Ans01 {
    public static void main(String[] args) {
        String my_string = "Bcad";
        System.out.println(solution(my_string));
    }

    public static String solution(String my_string) {
        String lower = my_string.toLowerCase();
        char[] charArr = lower.toCharArray();
        Arrays.sort(charArr);
        String result = new String(charArr);
        return result;
    }
}
