package lv0.배열.배열원소의길이;

import java.util.Arrays;

public class Ans02 {
    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};
        System.out.println(Arrays.toString(solution(strlist)));
    }

    public static int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}
