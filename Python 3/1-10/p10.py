import math
def isPrime(n):
    for i in range(2,int(math.sqrt(n))):
      if n%i==0:
          return 0
    return 1

sumi=2

for i in range(3,2000000,2):
    if(isPrime(i)==1):
        sumi=sumi+i
        # print(sumi,",")
print("Sum of primes below 2,000,000 is:",sumi)