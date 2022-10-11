public class NumberPalindrome {
  public static void main(String[] args){
    System.out.println(isPalindrome(12321)); // true
    System.out.println(isPalindrome(1)); // true
    System.out.println(isPalindrome(123456)); // false
  }
  
  public static boolean isPalindrome(int n){
  int r,s=0,temp;     
  
  temp=n;    
  while(n!=0){    
   r=n%10;  //getting remainder  
   s=(s*10)+r;    
   n=n/10;    
  }    
  if(temp==s)    
	return true;    
  else     
    return false;
  }
}
