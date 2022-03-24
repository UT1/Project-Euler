#Euler 45
import pandas as pd
from datetime import datetime
import math

# Memory Based Interpretation
def GenF1kNum():
    l=[]
    for n in range(2,100000):
        l.append(int(n*(n+1)/2))
        l.append(int(n*(3*n-1)/2))
        l.append(int(n*(2*n-1)))
    dfx=pd.DataFrame()
    dfx['Numbers']=l
    print(dfx['Numbers'].value_counts()[:2])
m1=datetime.now()
GenF1kNum()
m2=datetime.now()
print( "Time taken by Memory Based : ", m2-m1)


def gennum():
    print("T")
    [ print(int(n*(n+1)/2),end=",")  for n in range(1,31) ]
    print("P")
    [ print(int(n*(3*n-1)/2),end=",") for n in range(1,15)] 
    print("H")
    [ print(int(n*(2*n-1)),end=",") for n in range(1,15) ]

# Root Approach
def isRootReal(r1,r2):
    if (r1>0 and r1%1==0) or (r2>0 and r2%1==0):
        return True
    else:
        return False


def isTriangular(X):
    #  N^2 + N -2X = 0
    a=1
    b=1
    c=-1*2*X
    discrim = b*b -4*a*c
    r1 = (-b + math.sqrt(discrim))/(2*a)
    r2=  (-b - math.sqrt(discrim))/(2*a)
    return isRootReal(r1,r2)



def isPentagonal(X):
    #  3*N^2 - N -2X = 0
    a=3
    b=-1
    c=-1*2*X
    discrim = b*b -4*a*c
    r1 = (-b + math.sqrt(discrim))/(2*a)
    r2=  (-b - math.sqrt(discrim))/(2*a)
    return isRootReal(r1,r2)

def isHexagonal(X):
    #  2*N^2 -N -X = 0
    a=2
    b=-1
    c=-1*X
    discrim = b*b -4*a*c
    r1 = (-b + math.sqrt(discrim))/(2*a)
    r2=  (-b - math.sqrt(discrim))/(2*a)
    return isRootReal(r1,r2)

def fidTPH():
    for n in range(143,100000):
        i = int(n*(2*n-1))
        if isPentagonal(i):  
                print("Answer:",i,end='\n')
                break


m1=datetime.now()
fidTPH()
m2=datetime.now()
print( "Time taken by Root Approach: ", m2-m1)

# gennum()