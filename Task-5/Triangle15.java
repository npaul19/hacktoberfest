/* Triangle Pattern 15
* * * * *
*     *
*    *
*   *
*  *
* *
*
*/

public class Triangle15 
{
    public static void main(String[] args)
        {
        for(int i=1; i<=5; i++)//printing first line
            {
            System.out.print("* "); 
            } 
            System.out.println();
        
        
        for(int i=7; i>0; i--)//Second half of pattern
            {
                for(int j=1; j<=i; j++)
                {
                
                    if(j==i || j==1)
                    {
                        System.out.print("*"); //print star
                    }
                    else
                    {
                        System.out.print(" ");
                    }
            
                }
                System.out.println();//move to next line
            
            }
        }
    }
