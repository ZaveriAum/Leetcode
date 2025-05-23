public class App {

    public static int pivotIndex(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (left == total - left - nums[i])
                return i;
            left += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        int[] nums = { -1, -1, -1, -1, -1, 0 };
        // int[] nums = { 1, 7, 3, 6, 5, 6 };
        // int[] nums = { 1, 2, 3 };
        // int[] nums = { 2, 1, -1 };
        int o = pivotIndex(nums);
        System.out.println(o);
    }
}
