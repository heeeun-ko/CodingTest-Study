package lv0.배열.중복된문자제거;

import java.util.Arrays;

public class Ans01 {
    public static void main(String[] args) {
        String my_string = "people";
        System.out.println(solution(my_string));
    }

    public static String solution(String my_string) {

        String[] list = Arrays.stream(my_string.split(""))
                .distinct()
                .toArray(String[]::new);

        String answer = String.join("", list);
        return answer;
    }
}
