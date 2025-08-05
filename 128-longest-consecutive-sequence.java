//https://leetcode.com/problems/longest-consecutive-sequence/
//Time Complexity: O(n)
//Space Complexity: O(n)
class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length == 0){
        return 0;
       } 
       HashSet<Integer> num = new HashSet<Integer>();
       for(int i = 0; i < nums.length; i++){
        num.add(nums[i]);
       }
       int longestSub = 1;
       for(int n: num){
        if(num.contains(n - 1)){
            continue;
        }
        else{
            int currentNum = n;
            int currentSub = 1;
            while(num.contains(currentNum+1)){             
                currentNum++;
                currentSub++;
            }
            longestSub = Math.max(longestSub, currentSub);
            }
       }
       return longestSub;
    }
}