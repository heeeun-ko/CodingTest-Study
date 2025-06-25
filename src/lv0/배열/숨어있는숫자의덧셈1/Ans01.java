package lv0.배열.숨어있는숫자의덧셈1;

public class Ans01 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        System.out.println(solution(my_string));
    }

    public static int solution(String my_string) {
        String intStr = my_string.replaceAll("[^0-9]", "");
        int answer = 0;
        for (int i = 0; i < intStr.length(); i++) {
            answer += Character.getNumericValue(intStr.charAt(i));
        }

        return answer;
    }
}
