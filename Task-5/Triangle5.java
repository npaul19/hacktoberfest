/* Triangle Pattern 5
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
*/
public class Triangle5
{
	public static void main(String[] args) {
	      int row=5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(int i=4;i>=0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        	}
}
