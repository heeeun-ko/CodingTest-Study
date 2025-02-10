package feb6HW.올바른괄호;

public class Ans01 {
    public static void main(String[] args) {
        String s = "(()(";
        System.out.println(solution(s));
    }

    static boolean solution(String s) {
        boolean flag = true;
        int closeCnt = 0;
        int openCnt = 0;

        for (char c : s.toCharArray()) {
            if (c == ')') {
                closeCnt++;
            } else {
                openCnt++;
            }
            if (closeCnt > openCnt) {
                flag = false;
                break;
            }
        }
        if (closeCnt != openCnt) {
            flag = false;
        }
        
        return flag;
    }
}
