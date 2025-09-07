//https://leetcode.com/problems/longest-repeating-character-replacement/
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public int characterReplacement(String s, int k) {
        int leftPointer = 0;
        int[] occurences = new int[26];
        int answer = 0;
        int maxOccurence = 0;
        for(int rightPointer = 0; rightPointer < s.length(); rightPointer++){
            maxOccurence = Math.max(maxOccurence, ++occurences[s.charAt(rightPointer) - 'A']);
            if(rightPointer - leftPointer + 1 - maxOccurence > k){
                occurences[s.charAt(leftPointer) - 'A']--;
                leftPointer++;
            }
            answer = Math.max(answer, rightPointer-leftPointer + 1);
        }
        return answer;
    }
}