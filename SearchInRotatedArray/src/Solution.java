public class Solution {
    public static int search(int [] nums, int target){
        int low = 0, high = nums.length - 1;
        while(low <= high){
            int mid = (high - low)/2 + low;
            if(nums[mid] == target)
                return mid;
            else if (nums[low] == target)
                return low;
            else if (nums[high] == target)
                return high;
            else if(target < nums[low] && target < nums[mid]) {
                low ++;
                high--;
            }else if (target < nums[low] && target > nums[mid])
                low = mid + 1;
            else if (target > nums[low] && target > nums[mid])
                high = mid - 1;
            else if (target > nums[low] && target < nums[mid])
                high = mid - 1;
        }
        return -1;
    }
}
