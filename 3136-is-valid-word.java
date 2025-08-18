//https://leetcode.com/problems/valid-word/description/
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public boolean isValid(String word) {
        int character = 0;
        int vowel = 0;
        int consonant = 0;
        for(char ch : word.toCharArray()){
            if(word.length() < 3){
                return false;
            }
            else if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            char lower = Character.toLowerCase(ch);
            if ("aeiou".indexOf(lower) != -1) {
                vowel++;
            } else if (Character.isLetter(lower)) {
                consonant++;
            }
        }
        return consonant > 0 && vowel > 0;
    }
}