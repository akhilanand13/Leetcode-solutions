//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
//Time Complexity: O(n)
//Space Complexity: O(1)
//The solution uses the two-pointer technique on a sorted array. Start with one pointer at the beginning (leftPointer) and one at the end (rightPointer). Calculate the sum of the two pointed values. If the sum is less than the target, move leftPointer right to increase the sum. If the sum is more than the target, move rightPointer left to decrease it. When the sum equals the target, return the 1-based indices.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;
        while(leftPointer < rightPointer){
            if(target > numbers[leftPointer] + numbers[rightPointer]){
                leftPointer++;
            }
            else if(target < numbers[leftPointer] + numbers[rightPointer]){
                rightPointer--;
            }
            else if(target == numbers[leftPointer] + numbers[rightPointer]){
                return new int[]{leftPointer + 1, rightPointer + 1};
            }
        }
        throw new IllegalArgumentException ("Not found");
    }
}