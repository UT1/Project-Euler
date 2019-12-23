counter=1
number="."
while len(str(number))<1000001:
    number=number+str(counter)
    counter+=1
number=list(number)
ind=[1,10,100,1000,10000,100000,1000000]
product=1
for i in ind:
    product*=int(number[i])

print("Answer:",product)