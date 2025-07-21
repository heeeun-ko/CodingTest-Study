package lv2.깊이너비우선탐색.타겟넘버;

public class Ans01 {
    static int count = 0;

    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 1};
        int target = 4;
        System.out.println(solution(numbers, target));
    }

    public static int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);

        return count;
    }

    public static void dfs(int[] numbers, int depth, int target, int temp) {
        if (depth == numbers.length) {
            if (target == temp) {
                count++;
            }
            return;
        }

        int plus = temp + numbers[depth];
        int minus = temp - numbers[depth];

        dfs(numbers, depth + 1, target, plus);
        dfs(numbers, depth + 1, target, minus);
    }
}