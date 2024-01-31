nums=[10, 20, 40, 50]
def binarySearch(nums, target): 

    n = len(nums)  # size of the array
    low = 0
    high = n - 1

    # Perform the steps:
    while low <= high:
        mid = (low + high) // 2
        if nums[mid] == target:
            return mid
        elif target > nums[mid]:
            low = mid + 1
        else:
            high = mid - 1
    return -1


x = binarySearch(nums, 590)
print(x)