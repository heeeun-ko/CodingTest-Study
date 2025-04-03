package lv0.배열.배열의평균값;

public class Ans01 {
    static float solution(int[] numbers) {
        float sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        float ans = sum / numbers.length;
        return ans;
    }

    public static void main(String[] args) {
        int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        System.out.println(solution(numbers));
    }
}
