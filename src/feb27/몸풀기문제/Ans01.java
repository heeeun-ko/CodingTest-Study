package feb27.몸풀기문제;

public class Ans01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8};
        int target = 6;

        System.out.println(solution(arr, target));
    }

    static boolean solution(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
