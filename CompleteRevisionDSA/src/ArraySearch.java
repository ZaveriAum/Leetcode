public class ArraySearch {

    public static int LinearSearch(int [] nums, int n, int k){
        for (int i = 0; i < n; i++) {
            if(nums[i] == k)
                return i;
        }
        return -1;
    }

    // Binary Search Asc
    public static int BinarySearchA(int [] nums, int n, int k){
        int low = 0;
        int high = n - 1;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low)/2;
            if(nums[mid] == k)
                return mid;
            else if (nums[mid] > k)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    // Binary Search Dsc
    public static int BinarySearchD(int [] nums, int n, int k){
        int low = 0;
        int high = n - 1;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low)/2;
            if(nums[mid] == k)
                return mid;
            else if (nums[mid] > k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
