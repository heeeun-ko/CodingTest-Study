package feb27.몸풀기문제;

import java.util.HashSet;

public class Ans02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8};
        int target = 6;

        System.out.println(solution(arr, target));
    }

    static boolean solution(int[] arr, int target) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : arr) {
            if (hashSet.contains(target - i)) {
                return true;
            }
            hashSet.add(i);
        }

        return false;
    }
}