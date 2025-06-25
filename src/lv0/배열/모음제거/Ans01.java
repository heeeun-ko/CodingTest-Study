package lv0.배열.모음제거;

public class Ans01 {
    public static void main(String[] args) {
        String my_string = "nice to meet you";
        System.out.println(solution(my_string));
    }

    public static String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    break;

                default:
                    answer += c;
            }
        }

        return answer;
    }
}
