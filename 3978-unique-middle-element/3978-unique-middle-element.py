class Solution(object):
    def isMiddleElementUnique(self, nums):
       return nums.count(nums[len(nums) // 2]) == 1