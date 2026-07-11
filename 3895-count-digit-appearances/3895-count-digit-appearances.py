class Solution(object):
    def countDigitOccurrences(self, nums, digit):
        s = ""

        for num in nums :
            s += str(num)

        return s.count(str(digit))