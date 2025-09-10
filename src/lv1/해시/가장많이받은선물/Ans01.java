package lv1.해시.가장많이받은선물;

import java.util.HashMap;

public class Ans01 {
    public static void main(String[] args) {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan",
                "neo muzi"};

        System.out.println(solution(friends, gifts));
    }

    public static int solution(String[] friends, String[] gifts) {

        int answer = 0;
        int num = friends.length;

        // 주고받은 선물 표
        int[][] giftTable = new int[num][num];

        // 선물지수
        int[] giftIndex = new int[num];

        // 이름 찾기 HashMap
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            map.put(friends[i], i);
        }

        // 선물지수 계산, 주고 받은 선물 표 채우기
        for (String gift : gifts) {
            String[] giftName = gift.split(" ");
            giftIndex[map.get(giftName[0])]++; // 선물 준 사람 +1
            giftIndex[map.get(giftName[1])]--; // 선물 받은 사람 -1

            giftTable[map.get(giftName[0])][map.get(giftName[1])]++;
        }

        // 다음 달에 가장 선물을 많이 받을 사람
        for (int i = 0; i < num; i++) {
            int sum = 0;
            for (int j = 0; j < num; j++) {
                if (i == j) {
                    continue;
                }

                if (giftTable[i][j] > giftTable[j][i] ||
                        giftTable[i][j] == giftTable[j][i] && giftIndex[i] > giftIndex[j]) {
                    sum++;
                }
            }

            if (answer < sum) {
                answer = sum;
            }
        }

        return answer;
    }
}
