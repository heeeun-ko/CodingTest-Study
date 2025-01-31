package jan23HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    static List<Integer> solution(int[] arr, int divisor) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                res.add(arr[i]);
            }
        }

        if (res.isEmpty()) {
            res.add(-1);
        } else {
            Collections.sort(res);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        System.out.println(solution(arr, divisor));
    }
}
