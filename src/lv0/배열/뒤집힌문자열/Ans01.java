package lv0.배열.뒤집힌문자열;

public class Ans01 {
    static String solution(String my_string) {
        String reverse = "";

        char[] myChar = new char[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            myChar[my_string.length() - i - 1] = my_string.charAt(i);
        }

        for (char c : myChar) {
            reverse += c;
        }

        return reverse;
    }

    public static void main(String[] args) {
        String my_string = "abcd";

        System.out.println(solution(my_string));
    }
}