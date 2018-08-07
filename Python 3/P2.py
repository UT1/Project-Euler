"""Problem 2"""
prev1=1
prev2=2
fib_set=[1,2]

while prev2<4000000:
    next_fib=prev1+prev2
    prev1=prev2
    prev2=next_fib
    fib_set.append(next_fib)
        
answer=0
for m in fib_set:
    if m%2==0:
        answer=answer+m
print(answer)