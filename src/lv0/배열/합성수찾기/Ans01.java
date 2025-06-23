package lv0.배열.합성수찾기;

public class Ans01 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 4; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
