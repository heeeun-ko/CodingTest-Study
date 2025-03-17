package mar14HW.압축;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ans01 {
    public static void main(String[] args) {
        String msg = "TOBEORNOTTOBEORTOBEORNOT";

        int[] res = solution(msg);
        System.out.println(Arrays.toString(res));
    }

    static int[] solution(String msg) {
        HashMap<String, Integer> idxMap = new HashMap<>();
        for (int i = 1; i < 27; i++) {
            idxMap.put(Character.toString((char) (i + 64)), i);
        }

        List<Integer> list = new ArrayList<>();

        int addNum = 27;
        for (int i = 0; i < msg.length(); i++) {
            //i번째 글자
            String s = Character.toString(msg.charAt(i));

            //i번째 글자를 포함하는 가장 긴 문자열 찾기
            // i+1번째 글자가 msg 글자수보다 작을 경우와
            // i번째와 i+1번째를 더한 글자가 없을 때까지 반복
            while (i + 1 < msg.length() && idxMap.containsKey(s + msg.charAt(i + 1))) {
                s += msg.charAt(i + 1);
                i++;
            }

            //list에 추가
            list.add(idxMap.get(s));

            //다음 글자와 더해서 사전에 추가하기
            if (i + 1 < msg.length()) {
                idxMap.put(s + msg.charAt(i + 1), addNum);
            }
            addNum++;
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
