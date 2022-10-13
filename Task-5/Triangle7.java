/* Triangle Pattern 7
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
*/
public class Trinagle7 {

    public static void main(String[] args) {
	// write your code here
        int rows=9;
        for (int i= 0; i<= rows-1; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=rows-1-i; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();

        }


    }
}
