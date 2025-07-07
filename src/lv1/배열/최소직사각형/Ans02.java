package lv1.배열.최소직사각형;

public class Ans02 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(sizes));
    }

    public static int solution(int[][] sizes) {
        int w = 0;
        int h = 0;

        for (int[] size : sizes) {
            w = Math.max(w, Math.max(size[0], size[1]));
            h = Math.max(h, Math.min(size[0], size[1]));
        }
        int answer = w * h;
        return answer;
    }
}
