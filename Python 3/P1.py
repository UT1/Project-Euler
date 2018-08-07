"""Problem 1"""
su=0
for x in range(1,1000):
    if x%5==0 or x%3==0:
        su=su+x
print(su)         
