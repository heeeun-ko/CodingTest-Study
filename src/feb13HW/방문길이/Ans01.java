package feb13HW.방문길이;

import java.util.HashMap;
import java.util.HashSet;

public class Ans01 {
    public static void main(String[] args) {
        String dirs = "ULURRDLLU";

        int res = solution(dirs);
        System.out.println(res);
    }

    //좌표평면을 벗어나는지 체크
    private static boolean isValidMove(int nx, int ny) {
        return 0 <= nx && nx < 11 && 0 <= ny && ny < 11;
    }

    //다음 좌표 결정을 위한 해시맵 생성
    private static final HashMap<Character, int[]> location = new HashMap<>();

    private static void initLocation() {
        location.put('U', new int[]{0, 1});
        location.put('D', new int[]{0, -1});
        location.put('L', new int[]{-1, 0});
        location.put('R', new int[]{1, 0});
    }

    static int solution(String dirs) {
        initLocation();
        int x = 5, y = 5;
        HashSet<String> answer = new HashSet<>(); //중복 좌표 처리를 위해 HashSet 사용

        //주어진 명령어로 움직이면서 좌표 저장
        for (int i = 0; i < dirs.length(); i++) {
            int[] offset = location.get(dirs.charAt(i));
            int nx = x + offset[0];
            int ny = y + offset[1];
            if (!isValidMove(nx, ny)) { //벗어난 좌표는 유효하지 않으므로 좌표에 추가하지 않음
                continue;
            }
            //A에서 B로 간 경우 B에서 A도 추가해야 한다
            //총 경로의 개수는 방향성이 없다
            answer.add(x + " " + y + " " + nx + " " + ny);
            answer.add(nx + " " + ny + " " + x + " " + y);
            //좌표를 이동 후 좌표 업데이트
            x = nx;
            y = ny;
        }

        //A에서 B로 간 경우 B에서 A도 추가했으므로 최종 이동길이를 2로 나눈다.
        return answer.size() / 2;
    }
}


