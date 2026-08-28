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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> current = new ArrayList<>(levelSize);
            for(int i = 0;i<levelSize;i++){
                TreeNode currentNode = q.poll();
                current.add(currentNode.val);
                if(currentNode.left!=null){
                    q.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    q.offer(currentNode.right);
                }
            }
            list.add(current);
        }
        return list;
    }
}