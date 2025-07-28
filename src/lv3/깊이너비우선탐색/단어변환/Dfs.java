package lv3.깊이너비우선탐색.단어변환;

public class Dfs {

    static int answer = 0;
    static boolean[] visited;  // 단어 방문 여부 체크

    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        System.out.println(solution(begin, target, words));
    }

    public static int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];

        dfs(begin, target, words, 0);
        return answer;
    }

    private static void dfs(String begin, String target, String[] words, int cnt) {

        if (begin.equals(target)) {
            answer = cnt;
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (visited[i]) {
                continue;
            }

            // 한 단어에 같은 알파벳이 몇 개인지
            int j = 0;
            for (int k = 0; k < begin.length(); k++) {
                if (begin.charAt(k) == words[i].charAt(k)) {
                    j++;
                }
            }

            // 한 글자 빼고 모두 같은 경우
            if (j == begin.length() - 1) {

                // words[i] 단어를 방문했다고 표시
                visited[i] = true;

                // begin을 words[i]로 바꾸고 DFS 재귀 호출
                dfs(words[i], target, words, cnt + 1);

                // 탐색이 끝나고 되돌아오면, 다시 방문 표시를 해제
                // 다른 경로에서도 이 단어를 사용할 수 있어야 하니까, 사용하고 되돌아오면 방문 표시를 해제하기!
                visited[i] = false;
            }
        }
    }
}
