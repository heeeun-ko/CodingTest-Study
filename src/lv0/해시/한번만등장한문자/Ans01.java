package lv0.해시.한번만등장한문자;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ans01 {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charMap.put(s.charAt(i), charMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        // value가 1인 key 찾기
        List<Character> uniqueChars = new ArrayList<>();
        for (char c : charMap.keySet()) {
            if (charMap.get(c) == 1) {
                uniqueChars.add(c);
            }
        }

        // 알파벳순 정렬
        Collections.sort(uniqueChars);

        String answer = "";
        for (char c : uniqueChars) {
            answer += c;
        }

        return answer;
    }
}
