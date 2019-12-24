"""Project Euler : Problem 7"""
def isPrime(x):
    for m in range(2,int(x/2)):
        if int(x%m)==0:
            return 0
    return 1


flag=0
x=6

count=3

while (flag!=1):
   if isPrime(x)==1:
       count=count+1
   if count==10001:
       answer=x
       flag=1
   x=x+1

print("Answer:",answer)   