package lv0.배열.암호해독;

public class Ans01 {
    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        System.out.println(solution(cipher, code));
    }

    public static String solution(String cipher, int code) {
        String answer = "";
        for (int i = 0; i < cipher.length(); i++) {
            if ((i + 1) % code == 0) {
                answer += cipher.charAt(i);
            }
        }
        return answer;
    }
}
