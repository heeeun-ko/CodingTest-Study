package lv0.배열.편지;

public class Ans01 {
    public static void main(String[] args) {
        String message = "I love you~";
        System.out.println(solution(message));
    }

    public static int solution(String message) {
        return message.length() * 2;
    }
}
