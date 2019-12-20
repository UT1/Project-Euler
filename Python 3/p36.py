def dec_to_bin(n):
    return int(bin(n).replace("0b",""))


def isPalindrome(n):
    new=str(n)[::-1]
    if n==int(new):
        return 1
    else:
        return 0

su=0
for i in range(1,1000000):
    if isPalindrome(i)==1:
        bin_v=dec_to_bin(i)
        if isPalindrome(bin_v)==1:
            print(i,bin_v)
            su+=i
print("Answer:",su)