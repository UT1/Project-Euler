"""Project Euler : Problem 9"""

def isPythagoreanTriplet(a,b,c):
    if a*a+b*b==c*c:
        return 1
    else: 
        return 0


for a in range(1,1001):
    for b in range(1,1001-a):
        for c in range(1,1001-a-b):
            if isPythagoreanTriplet(a,b,c)== 1 and a+b+c==1000:
                print(a,b,c)
                break
                
                
