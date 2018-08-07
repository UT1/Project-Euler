"""Project Euler : Problem 29"""

import math
page=[]
for a in range(2,101):
    for b in range(2,101):
        x = math.pow(a,b)
        page.append(x)

print(len(set(page)))