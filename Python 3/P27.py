"""Project Euler : Problem 27"""
def isPrime(x):
    for m in range(2,int(x/2)):
        if int(x%m)==0:
            return 0
    return 1

lar=0

for a in range(-1000,1000):
    for b in range(-1000,1000):
        flag=0
        count=0
        n=0
        while(flag!=1):
            exp=n*n+a*n+b
            if isPrime(abs(exp))==1:
                count=count+1
            else:
                flag=1
            n=n+1
        if count>lar:
            lar=count
            a1=a
            b1=b                
            print(a,b,n,count)    


-61*971
