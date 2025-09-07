//https://leetcode.com/problems/validate-binary-search-tree/description/
//Time Complexity: O(n)
//Space Complexity: O(n)

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
    public boolean isValidBST(TreeNode root) {
        int[] finalresult = inorderTraversal(root);
        for(int i = 1; i < finalresult.length; i++){
            if(finalresult[i] <= finalresult[i-1]){
                return false;
            }
        }
        return true;
    }
    public int[] inorderTraversal(TreeNode node){
        ArrayList<Integer> array = new ArrayList<Integer>();
        inOrderTraversal(node, array);
        int[] result = new int[array.size()];
        for(int i = 0; i < array.size(); i++){
            result[i] = array.get(i);
        }
        return result;
    }
    private void inOrderTraversal(TreeNode node, ArrayList<Integer> array){
        if(node == null){
            return;
        }
        inOrderTraversal(node.left, array);
        array.add(node.val);
        inOrderTraversal(node.right, array);
    }
}