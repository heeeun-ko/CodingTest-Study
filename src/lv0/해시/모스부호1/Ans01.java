package lv0.해시.모스부호1;

import java.util.HashMap;

public class Ans01 {
    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";
        System.out.println(solution(letter));
    }

    public static String solution(String letter) {
        HashMap<String, String> morseMap = new HashMap<>();

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        char alpha = (char) 97;
        for (String m : morse) {
            morseMap.put(m, String.valueOf(alpha));
            alpha++;
        }

        String[] letterMorse = letter.split(" ");
        String answer = "";
        for (String lm : letterMorse) {
            answer += morseMap.get(lm);
        }

        return answer;
    }
}
