package lv1.해시.완주하지못한선수;

import java.util.HashMap;

public class Ans01 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String res = solution(participant, completion);
        System.out.println(res);
    }

    static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> participantMap = new HashMap<>();
        for (String s : participant) {
            if (!participantMap.containsKey(s)) {
                participantMap.put(s, 1);
            } else {
                participantMap.put(s, participantMap.get(s) + 1);
            }
        }

        for (String s : completion) {
            if (participantMap.containsKey(s)) {
                participantMap.put(s, participantMap.get(s) - 1);
                if (participantMap.get(s) == 0) {
                    participantMap.remove(s);
                }
            }
        }

        return participantMap.keySet().toString().replace("[", "").replace("]", "");
    }
}
