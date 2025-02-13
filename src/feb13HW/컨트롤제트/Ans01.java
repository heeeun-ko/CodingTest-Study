package feb13HW.컨트롤제트;

import java.util.Stack;

public class Ans01 {
    public static void main(String[] args) {
        String s = "10 20 30 40";

        System.out.println(solution(s));
    }

    static int solution(String s) {
        String[] noneS = s.split(" ");

        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < noneS.length; i++) {
            if (noneS[i].charAt(0) == 'Z') {
                int x = stack.pop();
                sum -= x;
            } else {
                int y = Integer.parseInt(noneS[i]);
                sum += y;
                stack.push(y);
            }
        }
        return sum;
    }
}