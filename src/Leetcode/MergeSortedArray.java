package Leetcode;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * 将数组2merge到数组1中，数组1有足够的长度
 *
 * @auther Dennis
 * @date 2017/12/12
 * 思想：从num1的尾部开始往前进行插入，这样就不用每个元素都移动了,时间复杂度O(m+n),空间复杂度O(1)
 */
public class MergeSortedArray {

    public static void merge(int A[], int m, int B[], int n) {
        if (n == 0) {
            return;
        }
        if (m == 0 && n != 0) {
            for (int i = 0; i < n; i++) {
                A[i] = B[i];
            }
        }
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {    //分别从数A和B最后的元素开始向前比较
            if (A[i] > B[j]) {
                A[k] = A[i];
                i--;
            } else {
                A[k] = B[j];
                j--;
            }
            k--;
        }
        while (i >= 0) {
            A[k] = A[i];
            i--;
            k--;
        }
        while (j >= 0) {
            A[k] = B[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] A = new int[]{3, 4, 6, 8, 9, 0, 0, 0, 0};
        int[] B = new int[]{2, 4, 5, 7};
        int m = 5;
        int n = 4;
        merge(A, m, B, n);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

}
