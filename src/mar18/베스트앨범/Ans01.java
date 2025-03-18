package mar18.베스트앨범;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ans01 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        int[] ans = solution(genres, plays);
        System.out.println(Arrays.toString(ans));
    }

    static int[] solution(String[] genres, int[] plays) {
        //장르별 속한 노래 play 수 합
        HashMap<String, Integer> playsPerGenre = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            if (playsPerGenre.containsKey(genres[i])) {
                Integer p = playsPerGenre.get(genres[i]);
                playsPerGenre.put(genres[i], p + plays[i]);
            } else {
                playsPerGenre.put(genres[i], plays[i]);
            }
        }

        //playsPerGenre Map의 value 내림차순 정렬 => key만 list에 저장
        List<String> keySetList = new ArrayList<>(playsPerGenre.keySet());
        Collections.sort(keySetList, (o1, o2) -> (playsPerGenre.get(o2).compareTo(playsPerGenre.get(o1))));
        // [pop, classic]

        int genreCnt = keySetList.size();  //2

        //새로 만들 앨범
        List<Integer> newAlbum = new ArrayList<>();

        //장르에 속한 곡들의 play 수 비교
        for (int i = 0; i < genreCnt; i++) {
            String genre = keySetList.get(i);

            //genrePlaysIdxMap은 <인덱스 번호, play수>를 저장
            HashMap<Integer, Integer> genrePlaysIdxMap = new HashMap<>();
            for (int j = 0; j < genres.length; j++) {
                if (genres[j].equals(genre)) {
                    genrePlaysIdxMap.put(j, plays[j]);
                }
            }

            //genrePlaysIdxMap Map의 value 내림차순 정렬 => key만 list에 저장
            List<Integer> keySort = new ArrayList<>(genrePlaysIdxMap.keySet());
            Collections.sort(keySort, (o1, o2) -> (genrePlaysIdxMap.get(o2).compareTo(genrePlaysIdxMap.get(o1))));

            //장르에 속한 곡 수가 하나일 경우
            if (keySort.size() < 2) {
                newAlbum.add(keySort.get(0));
            } else {
                //장르에 속한 곡 수가 둘 이상일 경우
                newAlbum.add(keySort.get(0));
                newAlbum.add(keySort.get(1));
            }
        }

        int[] answer = newAlbum.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}