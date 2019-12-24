import math
def isPrime(n):
    x=2
    if n!=1:
        while x<= int(math.sqrt(n)):
            if n%x==0:
                return 0
            x+=1
    else:
        return 0
    return 1


def gen_truncates(n):
    trunc=[]
    copy=n
    n=str(n)
    trunc.append(n)
    while len(n)>0:
       trunc.append(n[1:])
       n=n[1:]
    n=str(copy)
    while len(n)>0:
       trunc.append(n[:-1])
       n=n[:-1]
    trunc=[int(x) for x in trunc if x!='']
    return list(set(trunc))


def all_trun_prime(truncs):
    for x in truncs:
        if isPrime(x)==0:
            return 0
    return 1




# print(all_trun_prime(gen_truncates(3797)))
count=0
number=13
su=0
while(count<11):

    truncs=gen_truncates(number)
    if all_trun_prime(truncs)==1:
        count+=1
        print(number)
        su+=number
    number+=2

print("Answer:",su)