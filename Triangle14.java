import java.util.Scanner;

public class Triangle14 {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter the row size:");
        int i, k;
        int row_size = cs.nextInt();
        int x = 1;
        int y = row_size * 2 - 1;
        for (i = 1; i <= row_size; i++) {
            for (k = 1; k <= row_size * 2; k++) {
                if (k == x || k == y) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            x++;
            y--;
            System.out.println();
        }
        cs.close();
    }
}
