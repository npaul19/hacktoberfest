package AlphabetsPattern;
/* Diamond Pattern
        A
      B   B
    C       C
  D           D
E               E
  D           D
    C       C
      B   B
        A
*/
public class DiamondPattern {
    static private void printSpaces(int n){
        for(int i = 0 ; i < n; i ++) System.out.print(" ");
    }
    public static void main(String[] args) {
        int n = 5;
            
        //UPPER half
        for(int row = 1 ; row <= n ; row++){
            char base = (char)('A' + row - 1);
            printSpaces(2 * (n - row));
            System.out.print(base);

            if(row > 1){
                printSpaces(4 * row - 5);
                System.out.print(base);
            }
            System.out.println();
        }
            
        // LOWER half
        for(int row = n - 1 ; row >= 1 ; row --){
            char base = (char)('A' + row - 1);
            printSpaces(2 * (n - row));
            System.out.print(base);

            if(row > 1){
                printSpaces(4 * row - 5);
                System.out.print(base);
            }
            System.out.println();
        }
    }
}
