def fibonacci(n):
    firstNumber = 0
    secondNumber = 1
     
    if n < 0:
        print("Incorrect input")
         
    elif n <2:
        return n
   
    else:
        for i in range(2, n):
            result = firstNumber + secondNumber
            firstNumber = secondNumber
            secondNumber = result
        return  result
 
print(fibonacci(5))
