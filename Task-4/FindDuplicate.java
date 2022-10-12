import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FindDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 5));
        
        System.out.println(findDuplicateElement(arr));
    }

    private static int findDuplicateElement(ArrayList<Integer> arr) {
        ArrayList<Integer> elements = new ArrayList<>();
        int flag = 0;
        int duplicate = 0;
        for(int i: arr){
            if(!elements.contains(i))
                elements.add(i);
            else
            {
                flag = 1;
                duplicate = i;
            }
        }
        if (flag == 1)
            return duplicate;
        return -1;
    }
}
