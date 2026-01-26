"""
https://leetcode.com/problems/minimum-absolute-difference/description/
Time Complextiy: O(nlogn)
Space Complexity: O(n)
"""
class Solution:
    def minimumAbsDifference(self, arr: List[int]) -> List[List[int]]:
        arr.sort()
        min_diff = float("inf")
        res = []
        for i in range(1, len(arr)):
            curr_diff = abs(arr[i] - arr[i-1])
            if(min_diff > curr_diff):
                min_diff = curr_diff
                res = [[arr[i-1], arr[i]]]
            elif curr_diff == min_diff:
                res.append([arr[i-1], arr[i]])
        return res
        
