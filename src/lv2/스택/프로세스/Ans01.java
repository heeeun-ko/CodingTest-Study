package lv2.스택.프로세스;

import java.util.Collections;
import java.util.PriorityQueue;

public class Ans01 {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        solution(priorities, location);
    }

    public static int solution(int[] priorities, int location) {
        int answer = 1;

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int priority : priorities) {
            queue.add(priority);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (queue.peek() == priorities[i]) {
                    if (i == location) {
                        return answer;
                    }

                    queue.poll();
                    answer++;
                }
            }
        }

        return answer;
    }
}
