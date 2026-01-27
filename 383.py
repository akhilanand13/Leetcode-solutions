"""
https://leetcode.com/problems/ransom-note/description/
//Time Complexity: O(n + m)
//Space Complexity: O(1)
"""
class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        ransom_count = Counter(ransomNote)
        magazine_count = Counter(magazine)
        for char in ransom_count:
            if ransom_count[char] > magazine_count[char]:
                return False
        return True
