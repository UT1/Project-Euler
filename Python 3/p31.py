counter=0

for a in range(int(3)):
    for b in range(int(1+(200-100*a)/50)):
           for c in range(int(1+(200-100*a-50*b)/20)):
                    for d in range(int(1+(200-100*a-50*b-20*c)/10)):
                            for e in range(int(1+(200-100*a-50*b-20*c-10*d)/5)):
                                    for f in range(int(1+(200-100*a-50*b-20*c-10*d-5*e)/2)):
                                        counter += 1
                                        # print(counter)


print ("Answer is :",counter+1)
