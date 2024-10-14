class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        actual_sum = n*(n+1)//2
        sum = 0
        
        for i in range(len(nums)):
            sum+=nums[i]
        
        return actual_sum - sum
        