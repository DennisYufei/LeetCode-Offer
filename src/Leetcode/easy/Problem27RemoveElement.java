package Leetcode.easy;

/**
 * 给定一个数组和一个值，删除数组中该有和该值相等的元素，并返回新长度。要求空间复杂度为O(1)
 *
 * Created by Dennis on 2018/12/19.
 */
public class Problem27RemoveElement {

    /**
     * 双指针法，时间复杂度为O(n)，空间复杂度为O(1)
     *
     * @param nums 输入数组
     * @param val  目标值
     * @return int
     */
    public static int remove(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
                System.out.print(nums[j] + " ");
            }
        }
        System.out.println();
        return i;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3, 3, 4, 5, 6};
        int val = 3;
        System.out.println(remove(nums, val));
    }
}
