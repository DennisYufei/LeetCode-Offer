package Leetcode.easy;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * 将数组2merge到数组1中，数组1有足够的长度
 * 思路：从num1的尾部开始往前进行插入，这样就不用每个元素都移动了,时间复杂度O(m+n),空间复杂度O(1)
 * @author Dennis
 * @date 2017/12/12
 *
 */
public class Problem88MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0 && n != 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {    //分别从数A和B最后的元素开始向前比较
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (i >= 0) {
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{3, 4, 6, 8, 9, 0, 0, 0, 0};
        int[] nums2 = new int[]{2, 4, 5, 7};
        int m = 5;
        int n = 4;
        merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

}
