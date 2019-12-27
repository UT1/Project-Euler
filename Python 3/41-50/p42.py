def get_letter_sum_value(letters):
    su=0
    for m in letters:
        su+=(ord(m)-64)
    return su





import pandas as pd
data=pd.read_csv("p042_words.csv")
words=list(data.columns)

# lw=[]
# for x in words:
#     lw.append(len(x))
# print(max(lw))
#Max len word=14 


limit=14*26


tr=0
i=1
trinums=[]
while tr<limit:
    tr=1/2*i*(i+1)
    i+=1
    trinums.append(tr) 

print(get_letter_sum_value(['S','K','Y']))

count=0
for word in words:
    letters=[char for char in word]
    value=get_letter_sum_value(letters)
    if value in trinums:
        count+=1

print("Answer:",count)