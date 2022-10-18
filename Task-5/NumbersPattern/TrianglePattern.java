package NumbersPattern;
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
public class TrianglePattern{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of rows: ");

        int rows = sc.nextInt();

        //Printing upper half of the pattern

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }

        //Printing lower half of the pattern

        for (int i = rows-1; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }

        sc.close();
    }
}