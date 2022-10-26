def swapNumbers(firstNumber,secondNumber):
  firstNumber = firstNumber + secondNumber 
  secondNumber = firstNumber - secondNumber
  firstNumber = firstNumber - secondNumber
    
  print("After Swap:")
  print("Value of first number:", firstNumber)
  print("Value of second number:", secondNumber)
  
  
firstNumber = 10
secondNumber = 20

print("Before Swap:")
print("Value of first number:",firstNumber)
print("Value of second number:",secondNumber)
swapNumbers(firstNumber,secondNumber)
