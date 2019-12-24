"""Project Euler : Problem 5"""



def isDivisible(n):
    div=[20,19,18,17,16,15,14,13,12,11]
    for m in div:
        if int(n)%int(m)!=0:
            return 0
    return 1

x=20
flag=0

while(flag!=1):
    if isDivisible(x)==1:
        answer=x
        flag=1
    x=x+20
#    print(x)    
print("Answer:",answer)