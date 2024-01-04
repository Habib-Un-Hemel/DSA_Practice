# brute force 
# step-1 sort the arr
# step-2 print arr[n-1] where n is the size
# time complexity willbe nlogn for sort 
# s.complexity willbe 1

# method-2 (Normally i do like this)

arr=[10,30,10,2,3,99]
largest=arr[0]
for i in range(len(arr)):
    if largest<arr[i]:
        largest=arr[i]
print(largest)
