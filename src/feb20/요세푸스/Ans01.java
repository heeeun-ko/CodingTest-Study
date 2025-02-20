package feb20.요세푸스;

import java.util.ArrayDeque;

public class Ans01 {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;

        ArrayDeque<Integer> circle = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            circle.addLast(i + 1);
        }  // 1,2,3,4,5

        while (circle.size() != 1) {
            for (int i = 0; i < k - 1; i++) {
                int pollNum = circle.poll();
                circle.add(pollNum);
            }
            circle.poll();
        }

        System.out.println(circle);
    }
}
