//https://leetcode.com/problems/two-sum/
//Time Complexity: O(n)
//Space Complexity: O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int remaining = target - nums[i];
            if(hashmap.containsKey(remaining)){
                return new int[] {hashmap.get(remaining), i};
            }
            hashmap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}


