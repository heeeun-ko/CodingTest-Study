package lv0.수학.세균증식;

public class Ans01 {
    public static void main(String[] args) {
        int n = 7;
        int t = 15;
        System.out.println(solution(n, t));
    }

    public static int solution(int n, int t) {
        return n * (int) Math.pow(2, t);
    }
}
