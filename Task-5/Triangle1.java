/* Triangle Pattern 1
*
* *
* * *
* * * *
* * * * *
*/
public class Triangle1 {
  public static void main(String[] args){
    int r=5;
    for(int i=0;i<r;i++){
      for(int j=0;j<=i;j++){
        System.out.print("*");
        if(j<i){
          System.out.print(" ");
        }
      }
      if(i<r-1){
        System.out.println();
      }
    }
  }
}
