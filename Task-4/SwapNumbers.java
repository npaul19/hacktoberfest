public class SwapNumbers{
  public static void main(String[] args){
    int firstNumber = 5, secondNumber = 7;
    System.out.println("Before Swap:");
    System.out.println("First Number = " + firstNumber + " Second Number = "+ secondNumber);
    swapNumbers(firstNumber, secondNumber);
  }
  
  static void swapNumbers(int firstNumber, int secondNumber){
    firstNumber = firstNumber - secondNumber;
    secondNumber = firstNumber + secondNumber;
    firstNumber = secondNumber - firstNumber;
    System.out.println("After Swap:");
    System.out.println("First Number = " + firstNumber + " Second Number = "+ secondNumber);
  }
}



/*prints
Before Swap:
First Number = 5 Second Number = 7
After Swap:
First Number = 7 Second Number = 5
*/

