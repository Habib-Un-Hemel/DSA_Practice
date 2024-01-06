n=int(input())  
# taking n as a input 
## write your code !!
x=n
rev_num=0
while n>0:
    last_digit=n%10
    rev_num=(rev_num*10) + last_digit
    n=int(n/10)
   
if rev_num==x:
    print("true")
else:
    print("false")
