//https://leetcode.com/problems/number-of-zero-filled-subarrays/
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long subarr = 0;
        for(Integer number : nums){
            if(number == 0){
                subarr++;
                count += subarr;
            }
            else{
                subarr = 0;
            }
        }
        return count;
    }
}