import pandas as pd
import statistics
import math
su=[]
for x in range(400,3,-1):
    for y in range(400,3,-1):
            z=math.sqrt(x*x+y*y)
            if x*x+y*y==z*z:
                if x+y+z<1000:
                    su.append(x+y+z)
df=pd.DataFrame()

print("Answer:",statistics.mode(su))

