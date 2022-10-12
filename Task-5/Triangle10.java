/* Triangle Pattern 10
* * * * *
  * * *
    *
  * * *
* * * * *
*/
public class Triangle10 {
  public static void main(String[] args){
    // Write code here
   int rows = 5;  //Row of 5 stars
   
   //Upper stars 5 --> 3 --> 1
   for (int i=0; i<rows; i=i+2){
    for (int j=0; j<i; j++){
     System.out.print(" ");
    }
    for (int k=i; k<rows; k++){
     System.out.print("*" + " ");
    } 
    System.out.println("");
   } 
   
   //Lower stars 3 --> 5
   for (int i=rows-3; i>=0; i=i-2){
    for (int j=0; j<i ;j++){
     System.out.print(" ");
    }
    for (int k=i; k<rows; k++){
     System.out.print("*" + " ");
    }
    System.out.println("");
   }
  }
}
