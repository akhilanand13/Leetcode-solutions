//https://leetcode.com/problems/palindrome-number/
//Time Complexity: O(n)
//Space Complexity: O(n)

class Solution {
    public Boolean isPalindrome(int x){
        String z = Integer.toString(x);
        String y = "";
        char ch;
        for(int i = z.length() - 1; i >= 0; i--){
            ch = z.charAt(i);
            y += ch;
        }
        if(z.equals(y)) return true;
        else return false;
    }
}