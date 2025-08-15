package lv2.수학.카펫;

import java.util.Arrays;

public class Ans01 {
    public static void main(String[] args) {
        int brown = 24;
        int yellow = 24;
        int[] result = solution(brown, yellow);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int brown, int yellow) {
        int sum = (brown - 4) / 2;
        int r = (int) Math.ceil((double) sum / 2);
        int c = sum - r;

        while (r * c != yellow) {
            r++;
            c--;
        }

        int[] answer = {r + 2, c + 2};
        return answer;
    }
}
