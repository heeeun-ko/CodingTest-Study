package mar25.트리순회;

import java.util.Arrays;

public class Ans01 {
    public static void main(String[] args) {
        int[] nodes = {1, 2, 3, 4, 5, 6, 7};

        String[] res = solution(nodes);
        System.out.println(Arrays.toString(res));
    }

    static String[] solution(int[] nodes) {
        String[] result = new String[3];
        result[0] = preorder(nodes, 0).trim();
        result[1] = inorder(nodes, 0).trim();
        result[2] = postorder(nodes, 0).trim();

        return result;
    }

    private static String preorder(int[] nodes, int idx) {
        if (idx >= nodes.length) {
            return "";
        }

        return nodes[idx] + " " +
                preorder(nodes, idx * 2 + 1) +
                preorder(nodes, idx * 2 + 2);
    }

    private static String inorder(int[] nodes, int idx) {
        if (idx >= nodes.length) {
            return "";
        }

        return inorder(nodes, idx * 2 + 1) +
                nodes[idx] + " " +
                inorder(nodes, idx * 2 + 2);
    }

    private static String postorder(int[] nodes, int idx) {
        if (idx >= nodes.length) {
            return "";
        }

        return postorder(nodes, idx * 2 + 1) +
                postorder(nodes, idx * 2 + 2) +
                nodes[idx] + " ";
    }

}