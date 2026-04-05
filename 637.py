#https://leetcode.com/problems/robot-return-to-origin/description/
#Time Complexity: O(N) Where N is the length of the string and we are iterating through the string.
#Space Complexity: O(1)

class Solution:
    def judgeCircle(self, moves: str) -> bool:
        x = y = 0
        for move in moves:
            #Moving UP
            if move == "U": 
                y += 1
            #Moving DOWN
            if move == "D":
                y -= 1
            #Moving LEFT
            if move == "L":
                x -= 1
            #Moving RIGHT
            if move == "R":
                x += 1
        if x == y == 0:
            return True
        else:
            return False
