class ReverseNumber
{    
  static  int reverse(int number) {
    int reversed = 0;
    while(number != 0) {  
      int remainder = number % 10;  
      reversed = reversed * 10 + remainder;  
      number = number/10;  
      }
    return reversed;
 
  }
  public static void main(String args[])
  {
    System.out.println(reverse(123)); // Output = 321
  }
}
