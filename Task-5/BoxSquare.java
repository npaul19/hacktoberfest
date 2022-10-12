/* Box Square Pattern
* * * * *
*       *
*       *
*       *
* * * * *
*/
public class BoxSquare {
  public static void main(String[] args){
      
    int m=5,n=5;
    for(int i=1;i<=m;i++){
        //outer loop
        for (int j=1; j<=n; j++) {
            //inner loop
            if (i==1 || j==1 || i==n || j==n){
                System.out.print("* ");
            }
            else{System.out.print("  ");
                }
        }
        System.out.println();
    }
  }
}
