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
// class Solution {
    // public List<List<Integer>> levelOrder(TreeNode root) {
        
    // }
//}

// import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        // If tree is empty
        if (root == null) {
            return result;
        }

        // Queue for BFS
        Queue<TreeNode> queue = new LinkedList<>();

        // Put root into queue
        queue.offer(root);

        // Continue until queue becomes empty
        while (!queue.isEmpty()) {

            // Number of nodes in current level
            int size = queue.size();

            // Store current level
            List<Integer> currentLevel = new ArrayList<>();

            // Process all nodes of current level
            for (int i = 0; i < size; i++) {

                TreeNode node = queue.poll();

                // Add node value
                currentLevel.add(node.val);

                // Add left child
                if (node.left != null) {
                    queue.offer(node.left);
                }

                // Add right child
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            // Add current level to result
            result.add(currentLevel);
        }

        return result;
    }
}