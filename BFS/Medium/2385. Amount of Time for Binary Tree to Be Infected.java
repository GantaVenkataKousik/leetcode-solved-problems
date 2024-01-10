/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private Map<Integer, ArrayList<Integer>> graph = new HashMap<>();

    public int amountOfTime(TreeNode root, int start) {
        convertToGraph(root);

        Queue<Integer> q = new LinkedList<>();
        Set<Integer> st = new HashSet<>();

        q.add(start);
        int time = 0;
        while (!q.isEmpty()) {
            time++;
            int n = q.size();
            for (int i = 0; i < n; i++) {
                int temp = q.poll();
                st.add(temp);

                if (graph.containsKey(temp)) {
                    ArrayList<Integer> l = graph.get(temp);
                    for (int ele : l) {
                        if (!st.contains(ele)) {
                            q.add(ele);
                        }
                    }
                }
            }
        }
        return time-1;
    }

    private void convertToGraph(TreeNode root) {
        if (root == null) return;

        if (root.left != null) {
            graph.computeIfAbsent(root.val, k -> new ArrayList<>()).add(root.left.val);
            graph.computeIfAbsent(root.left.val, k -> new ArrayList<>()).add(root.val);
        }

        if (root.right != null) {
            graph.computeIfAbsent(root.val, k -> new ArrayList<>()).add(root.right.val);
            graph.computeIfAbsent(root.right.val, k -> new ArrayList<>()).add(root.val);
        }

        convertToGraph(root.left);
        convertToGraph(root.right);
    }
}
