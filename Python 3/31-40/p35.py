import math

def gen_all_circular(num):
    circl=[]  
    l=0
    while l<len(str(num)):
        circl.append(int(num))
        num=str(num)[-1]+str(num)[0:len(str(num))-1]
        l+=1
    return circl

def isPrime(n):
    x=2

    while x<= int(math.sqrt(n)):
        if n%x==0:
            return 0
        x+=1
    return 1



# print(gen_all_circular(197))
all_cp=[]
total=1#Counting 2
for number in range(3,1000000,2):
    if isPrime(number)==1:
        tocheck=gen_all_circular(number)

        count=len(tocheck)
        count_s=0
        for x in tocheck:
            if isPrime(x)==1:
                count_s+=1
            else:
                break
        if count_s==count:
            print("Found circular prime: ",number," ",min(tocheck))
            all_cp.append(min(tocheck))
            total+=1
print("Answer: ",total)
