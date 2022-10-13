def reverse_number(num):
    reverseNum=0
    while num>0:
        quotient=num%10
        remainder=num//10
        reverseNum=(reverseNum*10)+quotient
        num=remainder
    return(reverseNum)

print("Reverse of number 123 is : ",reverse_number(123))
