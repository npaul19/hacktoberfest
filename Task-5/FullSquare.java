/* Full Square Pattern
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
*/

public class FullSquare {
  public static void main(String[] args) {
    // Write code here
    int squareSize = 5;

    for (int i = 0; i < squareSize; ++i) {
      for (int j = 0; j < squareSize; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}