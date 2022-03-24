import math
def genCompositeNumber():
    prime=[]
    for i in range(3,1000000,2):
        if isPrime(i) == False:
            # print(i)
            if followsConjecture(i,prime) ==False:
                print("Answers",i)
                break
        else:
            prime.append(i)
        

def isPrime(n):
    for i in range(2,int(math.sqrt(n))+1):
        if n%i==0:
            return False
    return True

def followsConjecture(n,prime):
    flag=0
    for i in prime:
        rem=n-i
        rem=rem/2
        sqrem=math.sqrt(rem)
        if sqrem%1==0:
            return True
            # print("****",n,'=',i,'+','2*',sqrem,'^2')
    return False

from datetime import datetime
m1=datetime.now()
genCompositeNumber()
m2=datetime.now()
print( "Time taken by Root Approach: ", m2-m1)
