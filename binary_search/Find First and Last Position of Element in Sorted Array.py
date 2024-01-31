#problem link:https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

def firstOccurance(arr, x):
    low = 0
    high = len(arr) - 1
    first = -1
    while low <= high:
        mid = (high + low) // 2
        if arr[mid] == x:
            first = mid
            high = mid - 1 # checking for the first occuance in the left 
        elif arr[mid] < x:
            low = mid + 1
        else:
            high = mid - 1
    return first

def lastOccurance(arr, x):
    low = 0
    high = len(arr) - 1
    last = -1
    while low <= high:
        mid = (high + low) // 2
        if arr[mid] == x:
            last = mid
            low = mid + 1 # checking for the last occuance  in right side 
        elif arr[mid] < x:
            low = mid + 1
        else:
            high = mid - 1  
    return last  


class Solution(object):
    def searchRange(self, nums, target):
        f = firstOccurance(nums, target)
        if f == -1:
            return [-1, -1]
        l = lastOccurance(nums, target)
        listt=[f, l]
        return listt
        