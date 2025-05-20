public class App {

    public static boolean increasingTriplet(int[] nums) {
        int seq1 = Integer.MAX_VALUE, seq2 = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= seq1) {
                seq1 = nums[i];
            } else if (nums[i] <= seq2) {
                seq2 = nums[i];
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        // int[] nums = { 6, 7, 1, 2, 3 };
        // int[] nums = { 1, 2, 3, 4, 5 };
        // int[] nums = { 2, 1, 5, 0, 4, 6 };
        // int[] nums = { 5, 4, 3, 2, 1 };
        // int[] nums = { 6, 7, 1, 2 };
        // int[] nums = { 2, 4, -1, -3 };
        // int[] nums = { 20, 100, 10, 12, 5, 13 };
        // int[] nums = { 1, 2, 1, 2, 1, 2, 1, 2, 1, 2 };
        int[] nums = { 1, 5, 0, 6 };

        boolean result = increasingTriplet(nums);
        System.out.println(result);
    }
}
