def largestOddNumber(num):
    result = ""
    i = len(num)
    while(i >= 0):
        if int(num[i-1]) % 2 != 0:
            print("hit")
            result = num[:i]
            break
        else:
            i = i - 1
    return result

def main():
    num = "52"
    print(num[0:0])
    print(largestOddNumber(num))

main()
