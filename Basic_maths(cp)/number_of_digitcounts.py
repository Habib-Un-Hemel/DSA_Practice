from math import *
def countDigit(X):

   count=0
   while X>0:
      count+=1
      X=X//10
      
   
   return count

print(countDigit(1199))
     
#method 2 with the help of logarothomic property

def countDigit(X: int) -> int:

   
   y=int(log(X,10)+1)
   return y
