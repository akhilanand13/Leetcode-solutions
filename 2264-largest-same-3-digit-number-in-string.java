//https://leetcode.com/problems/largest-3-same-digit-number-in-string/description/
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        for (int i = 2; i < num.length(); ++i) {
            if (num.charAt(i - 2) == num.charAt(i - 1) &&
                num.charAt(i - 1) == num.charAt(i)) {
                String curr = num.substring(i - 2, i + 1);
                if (curr.compareTo(ans) > 0) {
                    ans = curr;
                }
            }
        }
        return ans;
    }
}
