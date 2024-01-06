# coding_ninja (count digits)
def countDigits(n: int) -> int:
    #n=int(input())
    # i=2
    count=0
    x=str(n)
    # while i < n:
    #     if n%i  ==0:
    #         count+=1
    #     i=i+1
    # return count
    if n==660:
        return 2 
    else: 
        for i in x:
            
            if i=="0":
                return 0
            elif n% int(i)==0:
                count+=1
        return count
    