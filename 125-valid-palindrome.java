//https://leetcode.com/problems/valid-palindrome/
//Time Complexity: O(n)
//Space Complexity: O(1)
//The code uses two pointers moving from opposite ends toward the center, skipping non-alphanumeric characters and comparing valid characters (ignoring case) until they meet - if any comparison fails, it's not a palindrome.

class Solution {
    public boolean isPalindrome(String s) {
        int leftPointer = 0;
        int rightPointer = s.length() - 1;
        while(leftPointer < rightPointer){
            if(!Character.isLetterOrDigit(s.charAt(leftPointer))){
                leftPointer++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(rightPointer))){
                rightPointer--;
            }
            else if(Character.toLowerCase(s.charAt(leftPointer)) != Character.toLowerCase(s.charAt(rightPointer))){
                return false;
            }
            else{
                leftPointer++;
                rightPointer--;
            }
        }
        return true;
    }
}