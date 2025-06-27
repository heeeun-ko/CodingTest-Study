package lv0.배열.배열원소의길이;

import java.util.Arrays;

public class Ans01 {
    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};
        System.out.println(Arrays.toString(solution(strlist)));
    }

    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
