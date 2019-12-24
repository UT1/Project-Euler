"""Project Euler : Problem 30"""


def getdigits(x):
    d=[]
    while x:
        d.append(x%10)
        x//=10
    return d


import math
sumanswer=0
for x in range(2,999999):
    de=getdigits(x)
    su1=0
    for m in de:
        su1=su1+math.pow(m,5)
    if int(su1)==x:
        print(x)
        sumanswer=x+sumanswer

print(sumanswer)