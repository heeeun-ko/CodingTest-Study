package lv0.배열.개미군단;

public class Ans01 {
    public static void main(String[] args) {
        int hp = 23;
        System.out.println(solution(hp));
    }

    public static int solution(int hp) {
        int answer = 0;

        answer += hp / 5;
        hp %= 5;

        answer += hp / 3;
        hp %= 3;

        answer += hp;

        return answer;
    }
}
