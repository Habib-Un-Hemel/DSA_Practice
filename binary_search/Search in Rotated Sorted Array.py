#problem link: https://leetcode.com/problems/search-in-rotated-sorted-array/

class Solution(object):
    def search(self, nums, target):
        low = 0
        high = len(nums) - 1
        while low <= high:
            mid = (low + high)//2
            if nums[mid] == target:
                return mid

            elif nums[mid] >= nums[low]:
                if nums[low] <= target and nums[mid] >= target:
                    high = mid -1
                else:
                    low = mid + 1

            else:
                if nums[mid] <= target and nums[high] >= target:
                    low = mid + 1
                else:
                    high = mid -1
        return -1
