"""Project Euler : Problem 28"""

n=1001
a=2
count=0
numbers=[1]
x=3
sum1=1
while x<=n*n:
    numbers.append(x)
    sum1=sum1+x
    count=count+1
    if count%4==0:
        a=a+2
    x=x+a
