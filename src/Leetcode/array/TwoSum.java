package Leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * TwoSum
 * Given nums = [2, 7, 11, 15], target = 9,Because nums[0] + nums[1] = 2 + 7 = 9,return [0, 1].
 * 给定一个数组和target，如果数组里的两个数相加等于target，则返回这两个数的索引
 *
 * Created by Dennis on 2018/12/17.
 */
public class TwoSum {

    /**
     * 蛮力法，算法复杂度为O(n²)，空间复杂度为O(1)
     * @param numbers 输入数组
     * @param target 目标数
     * @return int[]
     */
    public int[] twoSum(int numbers[], int target) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("请输入正确数组");
        }
        int result[] = new int[]{};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (target == numbers[i] + numbers[j]) {
                    result = new int[]{i, j};
                }
            }
        }
        if(result.length == 0){
            throw new IllegalArgumentException("没有合适的返回值");
        }
        return result;
    }

    /**
     * 用空间换取时间：hashmap方法，先用一个map把数组内的元素都put进去，然后与target减去的进行对比用元素作为key，
     * 索引为value，时间复杂度为O(n)，空间复杂度为O(n)
     * @param numbers 输入数组
     * @param target 目标数
     * @return int[]
     */
    public  int[] twoSum2(int[] numbers, int target) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("请输入正确数组");
        }
        int result[] = new int[]{};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            int c = target - numbers[i];
            if (map.containsKey(c) && map.get(c) != i) {
                result = new int[]{i, map.get(c)};
            }
        }
        if(result.length == 0){
            throw new IllegalArgumentException("没有合适的返回值");
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int numbers[] = new int[]{2, 7, 11, 15};
//        int numbers[] = new int[]{};
        int target = 9;
        int result[] = twoSum.twoSum(numbers, target);
        for (int i : result) {
            System.out.print(result[i] + " ");
        }
    }

}
