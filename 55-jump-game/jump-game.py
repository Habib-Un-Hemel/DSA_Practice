class Solution:
    def canJump(self, nums: List[int]) -> bool:

        maxJ = 0
        for i in range(len(nums)):
            if i > maxJ:
                return False
            maxJ = max(maxJ, i+nums[i])
        return True
        