# problemLink: https://leetcode.com/problems/search-insert-position/
# similar as lowerbound problem

class Solution(object):
    def searchInsert(self, arr, target):
        nums = len(arr)
        low = 0
        high = nums - 1
        ans = nums
        while low <= high:
            mid = (high + low) // 2
            if arr[mid] >= target:
                ans = mid
                high = mid - 1
            else:
                low = mid + 1
        return ans
