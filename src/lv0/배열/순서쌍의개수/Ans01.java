package lv0.배열.순서쌍의개수;

public class Ans01 {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }
        return answer;
    }
}
