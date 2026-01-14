class Solution:
    def isPalindrome(self, x: int) -> bool:
        s=str(x)
        ss=s[::-1]
        if s==ss:
            return True
        else :
            return False
