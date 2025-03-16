package mar14HW.의상;

import java.util.HashMap;

public class Ans01 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(solution(clothes));
    }

    static int solution(String[][] clothes) {
        HashMap<String, Integer> clothesMap = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0) + 1);
        }

        int answer = 1;
        for (String s : clothesMap.keySet()) {
            answer *= (clothesMap.get(s) + 1);
        }

        return answer - 1;
    }
}

