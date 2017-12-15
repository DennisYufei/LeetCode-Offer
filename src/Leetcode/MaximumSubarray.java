package Leetcode;

/**
 * 给一个数组，找出最大元素和
 * @auther Dennis
 * @date 2017/12/4
 */
public class MaximumSubarray {

    public static int Ms(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int global = nums[0];
        int local = nums[0];
        for (int i = 0; i < nums.length; i++) {
            local = Math.max(nums[i], nums[i] + local);
            global = Math.max(local, global);
        }
        return global;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(Ms(nums));
    }
}
