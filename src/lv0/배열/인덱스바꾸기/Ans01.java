package lv0.배열.인덱스바꾸기;

public class Ans01 {
    public static void main(String[] args) {
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;
        System.out.println(solution(my_string, num1, num2));
    }

    public static String solution(String my_string, int num1, int num2) {
        StringBuilder strb = new StringBuilder(my_string);
        char temp = my_string.charAt(num1);
        strb.setCharAt(num1, my_string.charAt(num2));
        strb.setCharAt(num2, temp);

        return strb.toString();
    }
}
