package Leetcode.array;

/**
 * 给定一个排序数组，删除重复的位置，使每个元素只出现一次，并返回新的长度。不要为另一个数组分配额外的空间，必须使用O（1）内存修改输入数组来实现这一点。
 * 思路：用快慢指针
 *
 * @auther Dennis
 * @date 2017/11/28
 */
public class RemoveDuplicatesFromSortedArray {

    public static int removeDup(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        System.out.print(nums[i]+" ");
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != nums[i]){//这个地方要注意，不相等才进入循环以此来达到删除重复元素的目的
                i++;
                nums[i] = nums[j];
                System.out.print(nums[i]+" ");
            }
        }
        System.out.println();
        return i+1;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,2,2,3,3,4,4,5};
        System.out.println(removeDup(nums));
    }

}
