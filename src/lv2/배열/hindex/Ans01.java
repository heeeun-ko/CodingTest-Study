package lv2.배열.hindex;

import java.util.Arrays;

public class Ans01 {
    public static void main(String[] args) {
        int[] citations = {3, 0, 1, 6, 5};
        int answer = solution(citations);
        System.out.println(answer);
    }

    public static int solution(int[] citations) {
        Arrays.sort(citations);

        int answer = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length - i) {
                answer = citations.length - i;
                break;
            }
        }

        return answer;
    }
}
