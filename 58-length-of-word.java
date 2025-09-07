//https://leetcode.com/problems/length-of-last-word/
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int finalcount = 0;
        for(Character ch : s.toCharArray()){
            if(ch == ' '){
                if(count > 0){
                    finalcount = count;
                    count = 0;
                }
            }
            else{
                count++;
            }
        }
        if(count > 0){
            finalcount = count;
        }
        return finalcount;
    }
}