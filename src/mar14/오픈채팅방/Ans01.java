package mar14.오픈채팅방;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ans01 {
    public static void main(String[] args) {
        String[] record = {
                "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"
        };

        String[] ans = solution(record);
        System.out.println(Arrays.toString(ans));
    }

    static String[] solution(String[] record) {
        HashMap<String, String> idName = new HashMap<>();

        for (String r : record) {
            String[] splitR = r.split(" ");
            if (!splitR[0].equals("Leave")) {
                idName.put(splitR[1], splitR[2]);
            }
        }

        List<String> ans = new ArrayList<>();
        for (String r : record) {
            String[] splitR = r.split(" ");
            if (splitR[0].equals("Enter")) {
                ans.add(idName.get(splitR[1]) + "님이 들어왔습니다.");
            } else if (splitR[0].equals("Leave")) {
                ans.add(idName.get(splitR[1]) + "님이 나갔습니다.");
            }
        }

        String[] answer = ans.stream().toArray(String[]::new);
        return answer;
    }
}