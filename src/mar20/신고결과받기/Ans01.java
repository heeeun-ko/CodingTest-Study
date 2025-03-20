package mar20.신고결과받기;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Ans01 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        int[] res = solution(id_list, report, k);
        System.out.println(Arrays.toString(res));
    }

    static int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, Set<String>> reportMap = new HashMap<>();
        HashMap<String, Integer> reprotCnt = new HashMap<>();
        Set<String> kReportSet = new HashSet<>();

        //중복 제거
        String[] newReport = Arrays.stream(report).distinct().toArray(String[]::new);

        for (String r : newReport) {
            String userId = r.split(" ")[0];
            String reportId = r.split(" ")[1];

            //reportMap
            reportMap.computeIfAbsent(userId, s -> new HashSet<>()).add(reportId);

            //reportCnt
            reprotCnt.put(reportId, reprotCnt.getOrDefault(reportId, 0) + 1);

            //k번 이상 신고 당할 경우
            if (reprotCnt.get(reportId) >= k) {
                kReportSet.add(reportId);
            }
        }

        int[] mail = new int[id_list.length];

        for (int i = 0; i < id_list.length; i++) {
            int cnt = 0;
            String userId = id_list[i];
            if (reportMap.containsKey(userId)) {
                for (String r : reportMap.get(userId)) {
                    if (kReportSet.contains(r)) {
                        cnt++;
                    }
                }
            }
            mail[i] = cnt;
        }

        return mail;
    }
}
