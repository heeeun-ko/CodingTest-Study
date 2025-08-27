package lv0.배열.문자열계산하기;

public class Ans01 {
    public static void main(String[] args) {
        String my_string = "3 + 4";
        System.out.println(solution(my_string));
    }

    public static int solution(String my_string) {
        String[] splitString = my_string.split(" ");

        int answer = Integer.parseInt(splitString[0]);
        for (int i = 1; i < splitString.length; i += 2) {
            if (splitString[i].equals("+")) {
                answer += Integer.parseInt(splitString[i + 1]);
            } else {
                answer -= Integer.parseInt(splitString[i + 1]);
            }
        }

        return answer;
    }
}
