//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
//Time Complexity: O(n)
//Space Complexity: O(n)

import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution{
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;       
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;
        while(!queue.isEmpty()){
            int size = queue.size();
            Deque<Integer> level = new LinkedList<>();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(leftToRight){
                    level.addLast(node.val);
                } else{
                    level.addFirst(node.val);
                }
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            result.add(new ArrayList<>(level));
            leftToRight = !leftToRight;
        }
        return result;
    }
}
