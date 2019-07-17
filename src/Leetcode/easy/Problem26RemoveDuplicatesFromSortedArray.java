package Leetcode.easy;

/**
 * 给定一个排序数组，删除重复的位置，使每个元素只出现一次，并返回新的长度。不要为另一个数组分配额外的空间，
 * 必须使用O(1)内存修改输入数组来实现这一点。
 * Given nums = [0,0,1,1,1,2,2,3,3,4],
 * Your function should return length = 5,
 * with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
 *
 * Created by Dennis on 2018/12/18.
 */
public class Problem26RemoveDuplicatesFromSortedArray {

    /**
     * 思路：因为不能用额外空间，所以不能用hashmap，采用快慢指针，时间复杂度为O(n),空间复杂度为O(1)
     * @param nums 输入数组
     * @return int
     */
    public static int removeDup(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        System.out.print(nums[i]+" ");
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != nums[i]){ //这个地方要注意，不相等才进入循环以此来达到删除重复元素的目的
                i++;
                nums[i] = nums[j];
                System.out.print(nums[i]+" ");
            }
        }
        System.out.println();
        return i+1;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,2,2,2,3,3,4,4,5};
        System.out.println(removeDup(nums));
    }

}
