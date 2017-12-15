package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * TwoSum
 * Given nums = [2, 7, 11, 15], target = 9,Because nums[0] + nums[1] = 2 + 7 = 9,return [0, 1].
 * 给定一个数组和target，如果数组里的两个数相加等于target，则返回这两个数的索引
 *
 * @auther Dennis
 * @date 2017/11/20
 */
public class TwoSum {

    //1、蛮力法：这个思路很简单，就是两个for循环得到索引  时间复杂度为O(n²)，空间复杂度为O(1)
    public static int[] sum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("没有合适的返回值");
    }

    //2、用空间换取时间：hashmap方法，先用一个map把数组内的元素都put进去，然后与target减去的进行对比
    //   用元素作为key，索引为value，时间复杂度为O(n)，空间复杂度为O(n)
    public static int[] sum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];
            if (map.containsKey(c) && map.get(c) != i) {
                return new int[]{i, map.get(c)};
            }
        }
        throw new IllegalArgumentException("没有合适的返回值");
    }

    //3、简化方法2中的代码，让两个for循环变成一个for循环，时间复杂度和空间复杂度和方法2一样，都是O(n)
    public static int[] sum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];
            if (map.containsKey(c)) {
                return new int[]{map.get(c), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("没有合适的返回值");
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 7, 11, 3, 6, 15};
        int target = 9;
        //int[] a = sum1(nums, target);
        //int[] a = sum2(nums, target);
        int[] a = sum3(nums, target);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
