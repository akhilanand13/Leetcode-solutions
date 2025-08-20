//https://leetcode.com/problems/maximum-difference-by-remapping-a-digit/
//Time Complexity: O(1)
//Space Complexity: O(1)
class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        char targetMax = 0;
        for (char c : s.toCharArray()) {
            if (c != '9') {
                targetMax = c;
                break;
            }
        }
        String maxStr = (targetMax == 0) ? s : s.replace(targetMax, '9');
        int maxVal = Integer.parseInt(maxStr);
        char targetMin = s.charAt(0);
        String minStr = s.replace(targetMin, '0');
        int minVal = Integer.parseInt(minStr);
        return maxVal - minVal;
    }
}