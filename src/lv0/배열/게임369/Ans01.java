package lv0.배열.게임369;

public class Ans01 {

    public static void main(String[] args) {
        int order = 3;
        System.out.println(solution(order));
    }

    public static int solution(int order) {
//        String strOrder = String.valueOf(order);
        String strOrder = order + "";

        int answer = 0;
        for (int i = 0; i < strOrder.length(); i++) {
            if (strOrder.charAt(i) == '3' || strOrder.charAt(i) == '6' || strOrder.charAt(i) == '9') {
                answer++;
            }
        }
        return answer;
    }
}
