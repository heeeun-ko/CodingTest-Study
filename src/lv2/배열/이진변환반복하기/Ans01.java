package lv2.배열.이진변환반복하기;

import java.util.Arrays;

public class Ans01 {
    public static void main(String[] args) {
        String s = "110010101001";
        int[] result = solution(s);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(String s) {
        int count = 0;
        int zeroCount = 0;

        while (!s.equals("1")) {
            String noneZero = s.replace("0", "");
            zeroCount += s.length() - noneZero.length();
            int c = noneZero.length();
            s = Integer.toBinaryString(c);
            count++;
        }

        int[] answer = {count, zeroCount};

        return answer;
    }
}
