class Solution(object):
    def finalValueAfterOperations(self, operations):
        ans = 0

        for i in range(0, len(operations)):
            if(operations[i] == "++X" or operations[i] == "X++"):
                ans += 1
            if(operations[i] == "--X" or operations[i] == "X--"):
                ans -= 1

        return ans