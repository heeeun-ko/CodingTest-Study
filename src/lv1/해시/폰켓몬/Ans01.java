package lv1.해시.폰켓몬;

import java.util.HashSet;

public class Ans01 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }

        if (hs.size() > nums.length / 2) {
            return nums.length / 2;
        }

        return hs.size();
    }
}
