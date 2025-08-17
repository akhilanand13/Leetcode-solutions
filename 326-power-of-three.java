//https://leetcode.com/problems/power-of-three/
//Time Complexity: O(1)
//Space Complexity: O(1)

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        while(n % 3 == 0){
            n /= 3;
        }
        return n == 1;
    }
}