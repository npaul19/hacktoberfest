/* Triangle Pattern 4
        *
      * *
    * * *
  * * * *
* * * * *
*/
public class Triangle4 {
  public static void main(String[] args) {
    // Write code here

    int size = 5;

    for (int i = 1; i <= size; ++i) {
      for (int j = 1; j <= size; ++j) {
        if (i + j > size) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
