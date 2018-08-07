"""Problem 3"""
import math
num=600851475143
lar=3

def isPrime(x):

    for m in range(3,int(math.sqrt(x)),2):
        if x%m==0:
            return 0
    return 1

for x in range(3,int(math.sqrt(num)),2):
    if isPrime(x)==1 and num%x==0 and x>lar:
        lar=x

print("Answer:"+str(lar))        