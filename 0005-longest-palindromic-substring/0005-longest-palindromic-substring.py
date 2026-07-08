class Solution(object):
    def longestPalindrome(self, s):
        if (len(s) <= 1):
            return s

        def expandMid(left, right):
            while(left >= 0 and right < len(s) and s[left] == s[right]):
                left -= 1
                right += 1
            
            return s[left + 1 : right]

        maxStr = s[0]

        for i in range(len(s) - 1):
            odd = expandMid(i, i)
            even = expandMid(i, i + 1)

            if(len(odd) > len(maxStr)):
                maxStr = odd

            if(len(even) > len(maxStr)):
                maxStr = even

        return maxStr