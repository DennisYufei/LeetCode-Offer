package Leetcode;

/**
 * 给定一个数组和一个值，删除数组中该有和该值相等的元素，并返回新长度。要求空间复杂度为O(1)
 * 思路：看起来是很简单，但是不能用额外的空间去删除，所以不存在复制数组之类的操作
 *
 * @auther Dennis
 * @date 2017/11/29
 */
public class RemoveElement {

    //双指针法1，时间复杂度为O(n)，空间复杂度为O(1)
    public static int remove1(int[] nums, int val) {
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

    //双指针法2，时间复杂度为O(n)，空间复杂度为O(1)
    public static int remove2(int[] nums, int val){
        int i = 0;
        int n = nums.length;
        while(i<n){
            if(nums[i] == val){
                nums[i] = nums[n-1];
                n--;
            }else {
                i++;
            }
        }
        return i;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3, 3, 4, 5, 6};
        int val = 3;
        System.out.println(remove2(nums, val));
    }
}
