"""Project Euler : Problem 6"""

def sumOfSquares(x):
    sumos=0
    for m in range(1,x+1):
        sumos=sumos+(m*m)
    return sumos

def SquareofSum(x):
    squos=0
    for m in range(1,x+1):
        squos=squos+m
    return squos*squos


p1=sumOfSquares(100)
p2=SquareofSum(100)

print("Answer:",p2-p1)