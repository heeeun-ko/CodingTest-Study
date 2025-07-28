package lv3.깊이너비우선탐색.단어변환;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        System.out.println(solution(begin, target, words));
    }

    public static int solution(String begin, String target, String[] words) {

        boolean[] visited = new boolean[words.length];  // 중복 방문 방지
        Queue<Word> queue = new LinkedList<>();  // 탐색할 단어들을 Queue(큐) 에 저장

        queue.offer(new Word(begin, 0)); // 시작 단어와 현재 깊이(0단계)

        while (!queue.isEmpty()) {

            // 현재 단어 꺼내기
            Word current = queue.poll();

            // 현재 단어가 target이면 종료, 변환 횟수 반환
            if (current.word.equals(target)) {
                return current.count; // 최단 거리 도달
            }

            // 인접한 단어들(한 글자만 다른)을 큐에 넣음
            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && isOneLetterDifferent(current.word, words[i])) {
                    visited[i] = true;
                    queue.offer(new Word(words[i], current.count + 1));
                }
            }
        }

        return 0; // target에 도달할 수 없는 경우
    }

    // 한 글자 차이 판별 함수
    private static boolean isOneLetterDifferent(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diff++;
            }
        }
        return diff == 1;
    }

    static class Word {
        String word;  // 현재 단어
        int count;  // 몇 단계(depth)인지

        Word(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }
}
