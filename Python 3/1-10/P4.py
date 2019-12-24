"""Project Euler : Problem 4"""
def isPalindrome(n):
    rev=int(0)
    copy=int(n)
    while(copy>0):
        rev=rev*10
        rev=rev+(copy%10)
        copy=int(copy/10)
    if rev==n:
        return 1
    else:
        return 0

answer=0
for x in range(100,999):
    for y in range(100,999):
        num=x*y
#        print(num)
        if isPalindrome(num)==1:
#            print(num)
            if num>answer:
                answer=num
print(answer)            

