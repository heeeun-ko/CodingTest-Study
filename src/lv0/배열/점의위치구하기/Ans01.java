package lv0.배열.점의위치구하기;

public class Ans01 {
    public static void main(String[] args) {
        int[] dot = {2, 4};
        System.out.println(solution(dot));
    }

    public static int solution(int[] dot) {
        if (dot[0] > 0) {
            if (dot[1] > 0) {
                return 1;
            } else {
                return 4;
            }
        } else {
            if (dot[1] > 0) {
                return 2;
            } else {
                return 3;
            }
        }
    }
}
