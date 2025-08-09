//https://leetcode.com/problems/maximum-subarray/
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0], maxsum= nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum+nums[i]<nums[i]) {
                
                
                sum=nums[i];
            }
            else{
                  maxsum= Math.max(maxsum,sum);
                 sum+=nums[i]; }

maxsum= Math.max(maxsum,sum);
            
            
        }
        return maxsum;
    }
}