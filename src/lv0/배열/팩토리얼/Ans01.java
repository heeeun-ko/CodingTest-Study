package lv0.배열.팩토리얼;

public class Ans01 {
    public static void main(String[] args) {
        int n = 3628800;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 1;
        int i = 1;
        while (answer <= n) {
            i++;
            answer *= i;
        }
        return i - 1;
    }
}
