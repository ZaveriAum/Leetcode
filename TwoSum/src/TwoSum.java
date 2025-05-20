import java.util.Arrays;
import java.util.Hashtable;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Using hashmap
        /*HashMap<Integer, Integer> myTable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int othernum = target - nums[i];
            if(myTable.containsKey(othernum))
            {
                return new int[]{myTable.get(othernum), i};
            }
            myTable.put(nums[i], i);
        }
        return new int[]{0, 0};*/

        for(int i=1;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(target==nums[j]+ nums[j-i])
                {
                    return new int[]{j, j-i};
                }
            }
        }
        return null;
    }
}