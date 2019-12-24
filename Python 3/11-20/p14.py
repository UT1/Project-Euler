def get_chain_length(n):
    count=1
    while n>1:
        if n%2==0:
            n=n/2
        else:
            n=3*n+1
        count+=1
    if n==1:
        return count
    return -1


maxp=0
for n in range(3,1000000,2):
    chain_len=get_chain_length(n)
    if chain_len>maxp:
        maxp=chain_len
        answer=n

print("Answer:",answer)



