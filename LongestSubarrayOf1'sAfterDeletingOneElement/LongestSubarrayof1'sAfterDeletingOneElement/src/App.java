public class App {

    public static int longestSubarray(int[] nums) {
        int maxL = 0;
        int preL = 0;
        int curL = 0;
        boolean seen = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                maxL = Math.max(maxL, curL + preL);
                preL = curL;
                curL = 0;
                seen = true;
            } else {
                curL++;
            }
        }
        if (curL != 0) {
            maxL = Math.max(maxL, curL + preL);
            preL = curL;
            curL = 0;
        }
        return seen ? maxL : maxL - 1;
    }

    public static void main(String[] args) throws Exception {
        int[] x = { 1, 1, 0, 1 };
        // int[] x = { 0, 1, 1, 1, 0, 1, 1, 0, 1 };
        // int[] x = { 1, 1, 1 };
        int o = longestSubarray(x);
        System.out.println(o);
    }
}
