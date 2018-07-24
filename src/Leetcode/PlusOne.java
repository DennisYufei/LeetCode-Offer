package Leetcode;

/**
 * 给一个数组（首位不为0）加上一个数，返回这个素数组
 * 思路：需要考虑进位，如果加到数组第一个元素还需要进位则需要在第一个位置也就是a[0]位置加上1
 * @auther Dennis
 * @date 2017/12/5
 * <p/>
 *
 */
public class PlusOne {

    public static int[] plusOne(int[] nums) {
        int n = nums.length;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                ++nums[i];
                return nums;
            }else
                nums[i] = 0;
        }
        int [] nums1 = new int[n+1];
        nums1[0] = 1;
        return nums1;
    }

    public static void main(String[] args) {
        int [] nums = new int[]{9,9,8,9};
        for(int a : plusOne(nums)){
            System.out.print(a);
        }
    }


}
