import java.util.Arrays;

public class ArraySum {
  public static void main(String[] args){
    int [] array = {3,4,5,12};
    int sum = findArraySum(array);
    System.out.println("Sum: "+sum);
  }
  
  public static int findArraySum(int[] array){
    return Arrays.stream(array).sum();
  }
}





//prints Sum: 24
