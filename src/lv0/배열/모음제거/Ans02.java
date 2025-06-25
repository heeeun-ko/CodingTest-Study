package lv0.배열.모음제거;

public class Ans02 {
    public static void main(String[] args) {
        String my_string = "nice to meet you";
        System.out.println(solution(my_string));
    }

    public static String solution(String my_string) {
        String answer = "";

        answer = my_string.replaceAll("[aeiou]", "");

        return answer;
    }
}
