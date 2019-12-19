def isPandigital(a,b,c):
    word=str(a)+str(b)+str(c)
    word_list=sorted(word)
    # print(''.join(word_list))

    if ''.join(word_list)=='123456789':
        # print('Pandigital')
        return True
    # else:
    #     print('Not Pandigital')
    return False


# isPandigital(39,186,7254)

flag=0
prod=[]
answer=0
for x in range(0,1964):
    if flag==0:
        for y in range(0,1964):
            mul=x*y
            if mul < 987654321:
                if isPandigital(x,y,mul):
                    # print(x,'*',y,'=',mul)
                    # if mul in rev:
                    #     print("Repeated")
                    # else:
                    prod.append(mul)
            else:
                # print("Reached---",x,'---',y)
                flag=1
    else:
        x=9999999999
print("Answer is :",sum(set(prod)))