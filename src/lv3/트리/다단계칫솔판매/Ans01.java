package lv3.트리.다단계칫솔판매;

import java.util.Arrays;
import java.util.HashMap;

public class Ans01 {
    public static void main(String[] args) {
        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"young", "john", "tod", "emily", "mary"};
        int[] amount = {12, 4, 2, 5, 10};

        int[] res = solution(enroll, referral, seller, amount);
        System.out.println(Arrays.toString(res));
    }

    static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {

        HashMap<String, String> enrollReferralMap = new HashMap<>();
        for (int i = 0; i < enroll.length; i++) {
            enrollReferralMap.put(enroll[i], referral[i]);
        }

        HashMap<String, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < seller.length; i++) {
            int price = amount[i] * 100;
            calculator(enrollReferralMap, resultMap, seller[i], price);
        }

        int[] result = new int[enroll.length];
        for (int i = 0; i < enroll.length; i++) {
            result[i] = resultMap.getOrDefault(enroll[i], 0);
        }

        return result;
    }

    static void calculator(HashMap<String, String> enrollReferralMap, HashMap<String, Integer> resultMap, String name,
                           int price) {
        String parent = enrollReferralMap.get(name);
        int sellerPrice = price - (price / 10);

        resultMap.put(name, resultMap.getOrDefault(name, 0) + sellerPrice);

        if (price / 10 > 0 && !parent.equals("-")) {
            calculator(enrollReferralMap, resultMap, parent, price / 10);
        }
    }
}