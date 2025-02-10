package feb6.실패율;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

// 실패... ㅜㅜ

public class Ans01 {
    static Double[] solution(int n, int[] stages) {
        int[] result = new int[n];

        Double[] failureRateList = new Double[n];
        for (int i = 1; i <= n; i++) {
            int count = 0;
            int userNum = stages.length;
            for (int stage : stages) {
                if (stage == i) {
                    count++;
                }
            }
            failureRateList[i] = (double) (count / userNum);
            userNum -= count;
        }

//        for (int i = 0; i < N; i++) {
//
//        }
        return failureRateList;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        int userNum = stages.length;
        double[] failureRateList = new double[n];
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int stage : stages) {
                if (stage == i) {
                    count++;
                }
            }
            failureRateList[i - 1] = (double) count / userNum;
            userNum -= count;
        }

        System.out.println(Arrays.toString(failureRateList));

        int[] result = new int[n];

        List<Double> failureDouble = DoubleStream.of(failureRateList).boxed().collect(Collectors.toList());
        for (int i = 0; i < n; i++) {
            double max = failureDouble.stream().max(Double::compare).get();
            for (int j = 0; j < failureDouble.size(); j++) {
                if (failureDouble.get(j) == max) {
                    result[i] = j + 1;
                    failureDouble.remove(failureDouble.get(j));
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(result));


    }
}
