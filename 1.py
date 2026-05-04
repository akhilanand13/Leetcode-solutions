class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # Time Complexity: O(n2) 
        # n = len(nums)
        # for i in range(0, n):
        #     for j in range(i+1, n):
        #         if(nums[i] + nums[j] == target):
        #             return [i, j]
        # Time Complexity: O(n) Hash Map
        hashMap = {}
        for i in range(len(nums)):
            hashMap[nums[i]] = i
        for i in range(len(nums)):
            diff = target - nums[i]
            if diff in hashMap and hashMap[diff] != i:
                return[i, hashMap[diff]]