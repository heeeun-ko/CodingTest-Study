package lv0.해시.영어가싫어요;

public class Ans02 {
    public static void main(String[] args) {
        String numbers = "onefourzerosixseven";
        System.out.println(solution(numbers));
    }

    public static long solution(String numbers) {
        String[] numbersStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbersStr.length; i++) {
            numbers = numbers.replaceAll(numbersStr[i], String.valueOf(i));
        }

        long answer = Long.valueOf(numbers);
        return answer;
    }
}
