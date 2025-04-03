package lv1.배열.두개뽑아서더하기;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ans01 {
    static List<Integer> solution(int[] numbers) {
        int[] numbers2 = numbers.clone();

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers2.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    res.add(numbers[i] + numbers2[j]);
                }
            }
        }

        List<Integer> newRes = res.stream().distinct().sorted().collect(Collectors.toList());

        return newRes;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};

        System.out.println(solution(numbers));
    }
}
