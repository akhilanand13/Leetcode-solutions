//https://leetcode.com/problems/search-insert-position/
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int searchInsert(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}