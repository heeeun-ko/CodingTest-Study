package feb27.완주하지못한선수;

import java.util.HashMap;

public class Ans02 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String res = solution(participant, completion);
        System.out.println(res);
    }

    static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        //완주한 선수들의 이름을 해시맵에 저장
        for (String s : completion) {
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
        }

        //참가한 선수들의 이름을 키로 하는 값을 1씩 감소
        for (String s : participant) {
            //완주하지 못한 선수를 찾으면 반환
            if (hashMap.getOrDefault(s, 0) == 0) {
                return s;
            }
            hashMap.put(s, hashMap.get(s) - 1);
        }
        return null;
    }
}
