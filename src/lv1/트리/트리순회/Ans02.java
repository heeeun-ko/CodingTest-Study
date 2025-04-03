package lv1.트리.트리순회;

import java.util.Arrays;

public class Ans02 {
    public static void main(String[] args) {
        int[] nodes = {1, 2, 3, 4, 5, 6, 7};

        String[] res = solution(nodes);
        System.out.println(Arrays.toString(res));
    }

    static String[] solution(int[] nodes) {
        String[] ans = new String[3];
        ans[0] = preorder(nodes, 1).trim();
        ans[1] = inorder(nodes, 1).trim();
        ans[2] = postorder(nodes, 1).trim();

        return ans;
    }

    static String preorder(int[] nodes, int idx) {
        if (idx > nodes.length) {
            return "";
        }
        return nodes[idx - 1] + " " +
                preorder(nodes, idx * 2) +
                preorder(nodes, idx * 2 + 1);
    }

    static String inorder(int[] nodes, int idx) {
        if (idx > nodes.length) {
            return "";
        }

        return inorder(nodes, idx * 2) +
                nodes[idx - 1] + " " +
                inorder(nodes, idx * 2 + 1);
    }

    static String postorder(int[] nodes, int idx) {
        if (idx > nodes.length) {
            return "";
        }

        return postorder(nodes, idx * 2) +
                postorder(nodes, idx * 2 + 1) +
                nodes[idx - 1] + " ";
    }
}
