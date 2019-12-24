def factorial(n):
    if n>0:
        return n*factorial(n-1)
    else:
        return 1


n=90000
answer=0
while n>2:
    hu=[int(char) for char in str(n)]
    # print(hu)
    su=0
    for x in hu:
        su=su+factorial(x)
    if su==n:
        # print("Curious:",n)
        answer=answer+n
    n=n-1
    if n%100000==0:
        print("Done till ",n)
print("Answer is :",answer)