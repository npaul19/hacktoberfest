/* Triangle Pattern 9
    *
  * * *
* * * * *
  * * *
    *
*/
public class Triangle9 {
  public static void main(String[] args){
    // Write code here
    int row,space,i,j;
        row = 3;  
        space = row - 1;  
        for (j = 1; j<= row; j++)  
        {  
        	for (i = 1; i<= space; i++)  
        	{  
        		System.out.print(" ");  
        	}  
        	space--;  
        	for (i = 1; i <= 2 * j - 1; i++)  
        	{  
        		System.out.print("*");  
        	}  
        	System.out.println("");  
        } 

        space = 1;  
        for (j = 1; j<= row - 1; j++)  
        {  
        	for (i = 1; i<= space; i++)  
        	{  
        		System.out.print(" ");  
        	}  
        	space++;  
        	for (i = 1; i<= 2 * (row - j) - 1; i++)  
        	{  
        		System.out.print("*");  
        	}  
        	System.out.println("");  
        }  
  }
}