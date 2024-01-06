from os import *
from sys import *
from collections import *
from math import *
n=int(input())
i=0
dup=n
summ=0
count=len(str(n))
while n>0:
    last_digit=n%10
    summ+=pow(last_digit,count)
    n=n//10
# print(summ)
if summ==dup:
    print("true")
else:
    print("false")