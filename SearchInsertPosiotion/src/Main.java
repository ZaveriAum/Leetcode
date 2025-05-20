public class Main {

    public static int searchInsertPosition(int[] nums, int target){
        int low = 0;
        int high = nums.length -1 ;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low)/2;
            if(nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                high = mid -1;
            else
                low = mid + 1;
        }
        if(nums[mid] < target)
            return mid + 1;
        else
            return mid;
    }

    public static void main(String[] args) {
        int result = searchInsertPosition(new int []{1, 3, 5, 6}, 2);
        System.out.println(result);
    }
}