//https://leetcode.com/problems/product-of-array-except-self/
//Time Complexity: O(n)
//Space Complexity: O(n)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        Arrays.fill(answer, 1);
        int prefix = 1, postfix = 1;
        for(int i = 0; i < nums.length; i++){
            answer[i] = prefix;
            prefix = nums[i] * prefix;
        }
        for(int i = nums.length - 1; i >=0; i--){
            answer[i] = postfix * answer[i];
            postfix = nums[i] * postfix;
        }
        return answer;
    }
}