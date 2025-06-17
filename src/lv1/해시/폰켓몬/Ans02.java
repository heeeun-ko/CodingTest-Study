package lv1.해시.폰켓몬;

import java.util.HashMap;

public class Ans02 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {

        HashMap<Integer, Integer> pocket = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            pocket.put(nums[i], pocket.getOrDefault(nums[i], 0) + 1);
        }

        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (pocket.containsKey(nums[i])) {
                answer++;
                pocket.remove(nums[i]);
            }
            if (answer >= nums.length / 2) {
                break;
            }
        }
        return answer;
    }
}
