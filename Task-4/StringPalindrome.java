public class StringPalindrome {
  public static void main(String[] args){
    System.out.println(isPalindrome1("abcba")); // true
    System.out.println(isPalindrome1("abccba")); // true
    System.out.println(isPalindrome1("abcbbaz")); // false
  }

    //Time Complexity:- O(N)
    public static boolean isPalindrome1(String str){

      boolean check = true;
      int length = str.length();
      int halfLength;

      if( length % 2 == 0 )
        halfLength = length/2;
      else
        halfLength = (length-1)/2;

      //Iterate str till half-length
      for( int i=0; i<halfLength; i++)
        if( str.charAt(i) != str.charAt(length-i-1)){
          check = false;
          break;
        }
      return check;
  }
}
