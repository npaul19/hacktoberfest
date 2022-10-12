import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 5));
        
        System.out.println(findDuplicateElement(arr));
    }

    private static int findDuplicateElement(ArrayList<Integer> nums) {
        int duplicate = -1;
        for (int i = 0; i < nums.size(); i++) {
            int cur = Math.abs(nums.get(i));
            if (nums.get(cur) < 0) {
                duplicate = cur;
                break;
            }
            nums.add(cur, nums.get(cur)*-1);
        }
        return duplicate;
    }
}
