package lv0.배열.배열뒤집기;

import java.util.Arrays;

public class Ans01 {
    static int[] solution(int[] numList) {
        int[] result = new int[numList.length];
        for (int i = 0; i < numList.length; i++) {
            result[i] = numList[numList.length - i - 1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numList = {1, 2, 3, 4, 5};
        int[] res = solution(numList);
        System.out.println(Arrays.toString(res));
    }
}