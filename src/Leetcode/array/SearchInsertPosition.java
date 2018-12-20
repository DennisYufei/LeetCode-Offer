package Leetcode.array;

/**
 * 给一个排好序的数组和一个target，如果数组中有等于target则返回索引，如果没有则返回应该插入位置的索引
 * Example 1:
 * Input: [1,3,5,6], 5
 * Output: 2
 *
 * Example 2:
 * Input: [1,3,5,6], 2
 * Output: 1
 *
 * Example 3:
 * Input: [1,3,5,6], 7
 * Output: 4
 *
 * Example 4:
 * Input: [1,3,5,6], 0
 * Output: 0
 *
 * 思路：很典型的二分查找
 * Created by Dennis on 2018/12/20.
 */
public class SearchInsertPosition {

    public static int Sip(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 5, 7, 8};
        int target = 4;
        System.out.println(Sip(nums, target));
    }


}
