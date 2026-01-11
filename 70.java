//http://leetcode.com/problems/climbing-stairs/description/
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int previous1=2; 
        int previous2 = 1;
        for (int i = 3; i <= n; i++) {
            int current = previous1 + previous2;
            previous2 = previous1;
            previous1 = current;
        }
        return previous1;
    }
}