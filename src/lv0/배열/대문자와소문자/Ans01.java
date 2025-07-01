package lv0.배열.대문자와소문자;

public class Ans01 {
    public static void main(String[] args) {
        String my_string = "cccCCC";
        System.out.println(solution(my_string));
    }

    public static String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
        }

        return answer;
    }
}
