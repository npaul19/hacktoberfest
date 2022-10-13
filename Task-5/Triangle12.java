/* Triangle Pattern 12
*       *
  *   *
    *
  *   *
*       *
*/
public class Triangle12 {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int height;
    System.out.println("Enter height: ");
    height = in.nextInt();
   
   for(int i =1; i< height + 1; i++){
    for(int j = 1; j< height + 1; j++){
     if(i == j || i + j == height + 1)
      System.out.print("*");
     else
      System.out.print(" ");
    }
    System.out.println();
   }
  }
}
