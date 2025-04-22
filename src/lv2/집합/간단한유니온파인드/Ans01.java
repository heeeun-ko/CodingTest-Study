package lv2.집합.간단한유니온파인드;

import java.util.ArrayList;
import java.util.Arrays;

public class Ans01 {
    public static void main(String[] args) {
        int k = 3;
        int[][] operations = {{0, 0, 1}, {0, 1, 2}, {1, 1, 2}};

        Boolean[] ans = solution(k, operations);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] parent;

    static Boolean[] solution(int k, int[][] operations) {
        parent = new int[k];

        for (int i = 0; i < k; i++) {
            parent[i] = i;
        }

        ArrayList<Boolean> result = new ArrayList<>();

        for (int[] operation : operations) {
            if (operation[0] == 0) {
                // union
                union(operation[1], operation[2]);
            } else {
                result.add(find(operation[1]) == find(operation[2]));
            }
        }

        return result.toArray(new Boolean[0]);
    }

    private static int find(int a) {
        if (parent[a] != a) {
            parent[a] = find(parent[a]);
        }
        return parent[a];
    }

    private static void union(int x, int y) {
        int root1 = find(x);
        int root2 = find(y);
        if (root1 >= root2) {
            parent[root1] = root2;
        } else {
            parent[root2] = root1;
        }
    }
}
