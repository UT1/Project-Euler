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


def isPandigital(a):
    word=str(a)
    word_list=sorted(word)
    # print(''.join(word_list))
    panlist=['123456789','12345678','1234567','123456','12345','1234','123','12']
    if ''.join(word_list) in panlist:
        # print('Pandigital')
        return True
    # else:
    #     print('Not Pandigital')
    return False


pp=[]
for i in range(3,9999999,2):
    if isPandigital(i) and isPrime(i)==1:
        pp.append(i)
        # print(i)

print("Answer:",max(pp))
