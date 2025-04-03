package lv2.스택.괄호회전하기;

//프로그래머스 92.9 / 100.0

public class Ans01 {
    public static void main(String[] args) {
        String s = "[{]}";

        System.out.println(solution(s));
    }

    static int solution(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            String rotateStr = s.substring(i) + s.substring(0, i);
            if (correctSolution(rotateStr)) {
                result++;
            }
        }

        return result;
    }

    static boolean correctSolution(String rotateStr) {
        boolean flag = true;
        int cntA = 0;
        int cntB = 0;
        int cntC = 0;

        for (char c : rotateStr.toCharArray()) {
            switch (c) {
                case '[':
                    cntA++;
                    break;
                case ']':
                    cntA--;
                    break;

                case '{':
                    cntB++;
                    break;
                case '}':
                    cntB--;
                    break;

                case '(':
                    cntC++;
                    break;
                case ')':
                    cntC--;
                    break;
            }
            if (cntA < 0 || cntB < 0 || cntC < 0) {
                flag = false;
            }
        }
        if (cntA != 0 || cntB != 0 || cntC != 0) {
            flag = false;
        }

        return flag;
    }
}