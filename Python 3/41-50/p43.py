def isPandigital(a):
    word=str(a)
    word_list=sorted(word)
    # print(''.join(word_list))

    if ''.join(word_list)=='0123456789':
        # print('Pandigital')
        return True
    # else:
    #     print('Not Pandigital')
    return False


st="0123456789"
import itertools

def guessables(num):
    guesses = []
    for p in itertools.permutations(range(10),num):
        if p[0] != 0:
            guesses.append(''.join(map(str, p))) 
    return guesses

all_10dig=guessables(10)
su=0
count=0
for x in all_10dig:
    if isPandigital(x):
        if int(str(x)[1:4])%2==0 :
            if  int(str(x)[2:5])%3==0:
                if int(str(x)[3:6])%5==0:
                    if int(str(x)[4:7])%7==0:
                        if int(str(x)[5:8])%11==0: 
                            if int(str(x)[6:9])%13==0: 
                                if int(str(x)[7:10])%17==0:
                                    su+=int(x)
                                    # print(x)
    if count%100==0:
        print(count)
    count+=1
print("Answer:",su)