#Solution via Combination(m+n, n)


def factorial(n):
    if n>0:
        return n*factorial(n-1)
    else:
        return 1

m=20
n=20
answer=(factorial(m+n)/factorial(n))/factorial(n)
print("Answer:",answer)
