package lv0.트리.구슬을나누는경우의수;

public class Ans01 {
    public static void main(String[] args) {
        int balls = 3;
        int share = 2;
        System.out.println(solution(balls, share));
    }

    public static double solution(int balls, int share) {
        double answer = 1;

        for (int i = 0; i < share; i++) {
            answer *= (balls - i);
            answer /= (i + 1);
        }

        return answer;
    }
}