class Solution(object):
    def maxFrequency(self, nums, k):
        # its important to do because then ,i do not to need to look the next
        # ones ,only conern will be the first part
        nums.sort()
        left, right = 0, 0
        result, total = 0, 0 

        while right<len(nums):
            total += nums[right]
            while nums[right] * (right-left+1) > total + k:
                total -= nums[left]
                left += 1
            result = max(result, (right-left+1))
            right += 1
        
        return result