package lv0.해시.가위바위보;

import java.util.HashMap;

public class Ans01 {
    public static void main(String[] args) {
        String rsp = "205";
        System.out.println(solution(rsp));
    }

    public static String solution(String rsp) {
        HashMap<String, String> win = new HashMap<>();
        win.put("0", "5");
        win.put("2", "0");
        win.put("5", "2");

        String answer = "";
        String[] rspList = rsp.split("");
        for (String r : rspList) {
            answer += win.get(r);
        }

        return answer;
    }
}
