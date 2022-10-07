import java.util.*;
class TwinPrime //recursive
{
  int isPrime(int n,int i)
  {
    if(i==n)
      return 1;
    else if(n%i==0 || n==1)
      return 0;
    else
      return isPrime(n,i+1);
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    TwinPrime ob = new TwinPrime();
    System.out.println("Enter the two numbers:\n");
    int x= sc.nextInt();
    int y= sc.nextInt();
    int a= ob.isPrime(x,2);
    int b= ob.isPrime(y,2);
    if(a==1 && b==1 && Math.abs((x-y))==2)
      System.out.println(x+" and " +y+" are Twin Primes\n");
    else
      System.out.println("Not twin primes\n");
  }
}
