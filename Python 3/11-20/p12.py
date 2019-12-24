import math
def gen_nth_triangular_number(n):
    number= (n+1)*n/2
    return int(number)


def num_of_divisors(n) : 
    cnt = 0
    for i in range(1, (int)(math.sqrt(n)) + 1) : 
        if (n % i == 0) : 
              
            if (n / i == i) : 
                cnt = cnt + 1
            else : 
                cnt = cnt + 2
                  
    return cnt 


i=1
flag=0
while flag!=1:
    trn=gen_nth_triangular_number(i)
    nd=num_of_divisors(trn)
    if nd>500:
        print("Answer:",trn)
        flag=1
    i+=1