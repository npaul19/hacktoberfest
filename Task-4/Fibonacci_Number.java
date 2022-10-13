//Program to find nth Fibonacci Number
public class Fibonacci_Number{
  public static void main(String[] args){
    int number = 8;
    System.out.println("Nth number in the series is: "+findFib(number));
  }
  
  public static int findFib(int number){
    if(number < 2)
      return number;
    int first = 0;
    int second = 1;
    int sum =0;
    for(int i =2; i< number + 1; i++){
      sum = first + second;
      first = second;
      second = sum;
    }
    return sum;
  }
}
    



//prints.  Nth number in the series is: 21
