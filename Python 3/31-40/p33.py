from fractions import Fraction
product=1

for x in range(10,100):
    for y in range(x+1,100):
        common=list(set(str(x))&set(str(y)))
        
        if len(common)!=0:
            if common[0]!='0':
                num=list(str(x))
                den=list(str(y))

                num.remove(common[0])
                den.remove(common[0])

                if num[0]!='0' and den[0]!='0':
                    if Fraction(int(num[0]),int(den[0]))==Fraction(x,y):
                        product*=Fraction(x,y)
                        # print(x,"--",y)

print("Answer: ",product.denominator)