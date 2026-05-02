class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        # Time Complexity: O(n)
        # Space Complexity: O(n)
        # count = {}
        # res, maxCount = 0, 0
        # for i in nums:
        #     count[i] = 1 + count.get(i, 0)
        #     res = i if count[i] > maxCount else res
        #     maxCount = max(maxCount, count[i])
        # return res
        # Time Complexity: O(n)
        # Space Complexity: O(1)
        res, count = 0, 0
        for i in nums:
            if count == 0:
                res = i
            count += (1 if i == res else -1)
        return res