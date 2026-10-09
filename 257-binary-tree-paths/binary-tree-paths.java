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
public List<String> binaryTreePaths(TreeNode root) {
List<String> list = new ArrayList<>();


    traversal(root, "", list);

    return list; // Missing in your code
}

private void traversal(TreeNode node, String str, List<String> list) {
    if (node == null) return;

    if (str.isEmpty()) {
        str = str + node.val;
    } else {
        str = str + "->" + node.val;
    }

    if (node.left == null && node.right == null) {
        list.add(str);
        return;
    }

    traversal(node.left, str, list);
    traversal(node.right, str, list);


}

}