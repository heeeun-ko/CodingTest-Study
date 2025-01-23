package jan23;

import java.util.Arrays;
import java.util.stream.Stream;

public class Exam02 {
//    public static int[] solution(int[] arr) {
//        Arrays.sort(arr);
//
//        int[] tempArr = new int[arr.length];
//        tempArr[0] = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = 0; j <= i; j++) {
//                if (arr[i] != arr[j]){
//                    tempArr[i] =
//                }
//            }
//        }
//        return arr;
//    }

    public static void main(String[] args) {
//        int[] arr = {4, 2, 2, 1, 4, 3, 7, 7, 3, 58};
//
//        System.out.println(solution(arr));
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream = Arrays.stream(arr);
        System.out.println(stream);
    }
}