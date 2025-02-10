package feb6.실패율;

import java.util.Arrays;
import java.util.HashMap;

public class Ans02 {
    public static void main(String[] args) {
        int n = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        int[] result = solution(n, stages);
        System.out.println(Arrays.toString(result));

    }

    static int[] solution(int n, int[] stages) {
        int[] failureRateList = new int[n + 2];
        for (int i = 0; i < stages.length; i++) {
            failureRateList[stages[i]] += 1;
        }

        HashMap<Integer, Double> failureRateMap = new HashMap<>();
        double total = stages.length;

        for (int i = 1; i <= n; i++) {
            if (failureRateList[i] == 0) {
                failureRateMap.put(i, 0.0);
            } else {
                failureRateMap.put(i, failureRateList[i] / total);
                total -= failureRateList[i];
            }
        }

        int[] result = failureRateMap.entrySet()
                .stream()
                .sorted((o1, o2)
                        -> Double.compare(o2.getValue(), o1.getValue()))
                .mapToInt(HashMap.Entry::getKey)
                .toArray();

        return (result);
    }
}
