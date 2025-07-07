package lv1.배열.최소직사각형;

public class Ans01 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(sizes));
    }

    public static int solution(int[][] sizes) {
        int w;
        int h;
        if (sizes[0][0] >= sizes[0][1]) {
            w = sizes[0][0];
            h = sizes[0][1];
        } else {
            w = sizes[0][1];
            h = sizes[0][0];
        }

        for (int i = 1; i < sizes.length; i++) {
            if (sizes[i][0] >= sizes[i][1]) {
                if (w < sizes[i][0]) {
                    w = sizes[i][0];
                }
                if (h < sizes[i][1]) {
                    h = sizes[i][1];
                }
            } else {
                if (w < sizes[i][1]) {
                    w = sizes[i][1];
                }
                if (h < sizes[i][0]) {
                    h = sizes[i][0];
                }
            }
        }
        int answer = w * h;
        return answer;
    }
}
