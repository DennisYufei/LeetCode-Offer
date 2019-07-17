package Leetcode.easy;

/**
 * 给一个数组，找出最大元素和
 *
 * Created by Dennis on 2018/12/24.
 */
public class Problem53MaximumSubarray {

    /**
     * 思路：动态规划，定义一个全局变量和局部变量，时间复杂度为O(n),空间复杂度为O(1)
     *
     * @param nums 输入数组
     * @return int
     */
    public static int maxiMumSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("请输入正确数组");
        }
        int global = nums[0];
        int local = nums[0];
        for (int i = 1; i < nums.length; i++) {
            local = Math.max(nums[i], nums[i] + local);
            global = Math.max(local, global);
        }
        return global;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxiMumSubarray(nums));
    }
}
