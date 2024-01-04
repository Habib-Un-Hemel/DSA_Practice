
#burte force  sort then n-2 TC-> nlogn+n
#better solution will be iterate 2times .first for the largest then 2nd pass for the 2nd largest
#omtimize solution

def second_largest(n,a):
    largest=a[0]
    sLargest=-999999
    for i in range (n):
        if a[i]>largest:
            sLargest=largest
            largest=a[i]
        elif a[i]<largest and a[i]>sLargest:
            sLargest=a[i]
    return sLargest

def second_smallest(n,a):
    # print(n)
    # print(a)
    smallest= a[0]
    sSmallest=99999
    for i in range(n):
        if a[i] < smallest:
            sSmallest=smallest
            smallest=a[i]
        elif a[i]>smallest and a[i]<sSmallest:
            sSmallest=a[i]
    return sSmallest
def getSecondOrderElements(n: int,  a: [int]) -> [int]:

    large=second_largest(n,a)
    small=second_smallest(n,a)
    return (large,small)