package lv0.배열.삼각형의완성조건1;

import java.util.Arrays;

public class Ans01 {
    public static void main(String[] args) {
        int[] sides = {1, 2, 3};
        System.out.println(solution(sides));
    }

    public static int solution(int[] sides) {
        Arrays.sort(sides);
        if (sides[2] < sides[0] + sides[1]) {
            return 1;
        } else {
            return 2;
        }
    }
}
