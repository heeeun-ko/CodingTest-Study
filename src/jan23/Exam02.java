package jan23;

import java.util.Arrays;
import java.util.Collections;

public class Exam02 {
    public static int[] solution(int[] arr) {

        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        //Integer [] result2 = Arrays.stream(arr).boxed().distinct().sorted(Collections.reverseOrder()).toArray(Integer []::new);

        Arrays.sort(result, Collections.reverseOrder());

//        int[] arr2 = {1, 2, 2, 3};
//        int[] result2 = Arrays.stream(arr)
//                .distinct() // IntStream에서 중복 제거
//                .toArray();  // 기본형 배열(int[]) 생성
//        //기본 자료형 : int, String, double
//        System.out.println(Arrays.toString(result)); // [1, 2, 3]

        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 1, 4, 3, 7, 7, 3, 58};

        int[] arrResult = solution(arr);
        for (int r : arrResult) {
            System.out.print(r + ", ");
        }
    }
}