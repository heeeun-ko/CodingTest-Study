package lv0.수학.자릿수더하기;

public class Ans01 {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        String[] str = String.valueOf(n).split("");
        for (String s : str) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}
