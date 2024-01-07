def count_elements(target,arr):

   
    hash_arr=[0]*13
    for i in range(len(arr)):
        hash_arr[arr[i]]+=1
    return hash_arr[target]

arr=[1,2,4,4,5,5,5,5]

print(count_elements(5,arr))


