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
    
    
        for(int i=1; i<=9; i++)//printing first line
            {
            if (i%2!=0 ) 
                System.out.print("*"); 
            else 
                System.out.print(" "); } 
            System.out.println();
        
        
        for(int i=1; i<=6; i++)//Second half of pattern
            {
                for(int j=i; j<=7; j++)
                {
                    if(i==6) // stoping to print two star in last 
                    {
                        System.out.print("*");
                        break;
                        
                    }
              
                    if(j==i || j==7)
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
