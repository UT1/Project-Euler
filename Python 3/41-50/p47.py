import math
def isPrime(n):
    for i in range(2,int(math.sqrt(n))+1):
        if n%i==0:
            return False
    return True



def calFactors(n,prime):
    fac=[]
    for x in prime:
        if n%x==0:
            fac.append(x)
            if len(fac)>4:
                return 100
    # print("Prime factors---->",set(fac))
    return len(fac)


def soln():
    prime=[]
    for i in range(2,1000000):
        # print(i)
        if isPrime(i):
            prime.append(i)
        # print("Number:",i)
        # print(calFactors(i,prime))
        
        else:
            n1,n2,n3,n4=i,i+1,i+2,i+3    
            if calFactors(n1,prime)==4:
                    if calFactors(n2,prime)==4:
                            if calFactors(n3,prime)==4:
                                    if calFactors(n4,prime)==4:
                                        print("Answer:",n1,n2,n3,n4)
                                        break

from datetime import datetime
m1=datetime.now()
soln()
m2=datetime.now()
print( "Time taken : ", m2-m1)

