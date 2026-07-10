class Solution(object):
    def subtractProductAndSum(self, n):
        return eval('*'.join(str(n))) - eval('+'.join(str(n)))