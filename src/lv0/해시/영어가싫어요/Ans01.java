package lv0.해시.영어가싫어요;

import java.util.HashMap;

public class Ans01 {
    public static void main(String[] args) {
        String numbers = "onefourzerosixseven";
        System.out.println(solution(numbers));
    }

    public static long solution(String numbers) {
        HashMap<String, Integer> num = new HashMap<>();
        String[] numbersStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int[] numbersInt = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < numbersInt.length; i++) {
            num.put(numbersStr[i], numbersInt[i]);
        }

        String txt = "";
        String ans = "";
        for (int i = 0; i < numbers.length(); i++) {
            txt += numbers.charAt(i);
            if (num.containsKey(txt)) {
                ans += num.get(txt);
                txt = "";
            }
        }

        long answer = Long.valueOf(ans);

        return answer;
    }
}
