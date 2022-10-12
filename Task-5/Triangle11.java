/* Triangle Pattern 11
        *
      *
    *
  * 
*
*/
public class Triangle11 {
  public static void main(String[] args){
    int row=5;
    for(int i=row; i>0; i--){
      for(int j=0; j<i;j++){
        System.out.print("  ");
      }
      System.out.print("*");
      if(i>1){
        System.out.println();
      }
    }
  }
}