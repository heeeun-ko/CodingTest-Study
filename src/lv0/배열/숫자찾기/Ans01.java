package lv0.배열.숫자찾기;

public class Ans01 {
    public static void main(String[] args) {
        int num = 29183;
        int k = 1;
        System.out.println(solution(num, k));
    }

    public static int solution(int num, int k) {

        String strNum = String.valueOf(num);
        String strK = String.valueOf(k);

        int idx = strNum.indexOf(strK);

        return idx == -1 ? -1 : idx + 1;
    }
}
