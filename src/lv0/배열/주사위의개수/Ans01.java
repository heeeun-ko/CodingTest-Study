package lv0.배열.주사위의개수;

public class Ans01 {
    public static void main(String[] args) {
        int[] box = {10, 8, 6};
        int n = 3;
        System.out.println(solution(box, n));
    }

    private static int solution(int[] box, int n) {
        int answer = 1;
        for (int side : box) {
            answer *= side / n;
        }
        return answer;
    }
}
