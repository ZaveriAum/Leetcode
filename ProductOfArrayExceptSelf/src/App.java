import java.lang.reflect.Array;
import java.util.Arrays;

public class App {

    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int preSuf = 1;

        Arrays.fill(answer, 1);

        for (int i = 0; i < nums.length; i++) {
            answer[i] *= preSuf;
            preSuf *= nums[i];
        }
        preSuf = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= preSuf;
            preSuf *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        int[] nums = { 1, 2, 3, 4 };
        int[] ans = productExceptSelf(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
