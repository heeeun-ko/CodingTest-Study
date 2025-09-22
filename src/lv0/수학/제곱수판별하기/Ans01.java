package lv0.수학.제곱수판별하기;

public class Ans01 {
    public static void main(String[] args) {
        int n = 976;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        return (Math.sqrt(n) == (int) Math.sqrt(n) ? 1 : 2);
    }
}
