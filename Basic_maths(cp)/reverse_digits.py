def reverseBits(n):
        rev_num=0
        while n>0:
            last_digit=n%10
            rev_num=(rev_num*10)+last_digit
            n=n//10
        return rev_num
        
x=reverseBits(1080)
print(x)