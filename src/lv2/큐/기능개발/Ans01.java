package lv2.큐.기능개발;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ans01 {
    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        List<Integer> answer = solution(progresses, speeds);
        System.out.println(answer);
    }

    static List<Integer> solution(int[] progresses, int[] speeds) {
        Queue<Integer> days = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int day = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            days.offer(day);
        }

        List<Integer> res = new ArrayList<>();
        while (!days.isEmpty()) {
            int releaseDay = days.poll();
            int cnt = 1;

            while (!days.isEmpty() && days.peek() <= releaseDay) {
                days.poll();
                cnt++;
            }
            res.add(cnt);
        }
        return res;
    }
}
