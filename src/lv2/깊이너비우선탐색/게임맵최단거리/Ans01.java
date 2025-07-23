package lv2.깊이너비우선탐색.게임맵최단거리;

import java.util.LinkedList;
import java.util.Queue;

public class Ans01 {

    // 이동할 수 있는 좌표 (시계방향)
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        System.out.println(solution(maps));

    }

    public static int solution(int[][] maps) {

        int n = maps.length;  // 행
        int m = maps[0].length;  // 열

        boolean[][] visited = new boolean[n][m];

        // 최단거리는 bfs 사용
        int answer = bfs(maps, visited, n, m);

        return answer;
    }

    public static int bfs(int[][] maps, boolean[][] visited, int n, int m) {
        Queue<int[]> queue = new LinkedList<>();

        // 시작 노드
        visited[0][0] = true;
        queue.add(new int[]{0, 0});

        // 큐가 empty일 때까지 반복
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            // 이동
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위 밖일 경우
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }

                // 벽이거나 이미 방문한 곳일 경우
                if (visited[nx][ny] || maps[nx][ny] == 0) {
                    continue;
                }

                // 방문 처리 + 거리 갱신
                visited[nx][ny] = true;
                maps[nx][ny] = maps[x][y] + 1;  // 이전 위치 + 1
                queue.add(new int[]{nx, ny});
            }
        }

        // 도착점에 도달하지 못했으면 -1
        if (!visited[n - 1][m - 1]) {
            return -1;
        }

        // 도착 지점의 최단 거리
        return maps[n - 1][m - 1];
    }
}
