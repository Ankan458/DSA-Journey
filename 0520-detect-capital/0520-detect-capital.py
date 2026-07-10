class Solution(object):
    def detectCapitalUse(self, word):
        if len(word) == 1 :
            return True

        cap_count = 0
        count = 0

        for i in range (len(word)) :
            if ('A' <= word[i] <= 'Z') :
                cap_count += 1
            else :
                count += 1

        if cap_count == len(word) :
            return True

        if count == len(word) :
            return True

        if ('A' <= word[0] <= 'Z' and cap_count == 1 and count == len(word) - 1) :
            return True

        return False