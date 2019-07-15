package offer;

/**
 * 面试题29：数组中出现次数超过一半的数字
 * 思路：1、首先想到是数组排序，可以用快排，然后找到中间的数，算法复杂度为O(nlogn)
 * 2、数组中数字出现的次数超过数组长度的一半，也就是出现的次数比其他数字出现的次数的总和还要多，可以保存两个值，一个是
 * 数字，一个是出现的次数，只需要遍历一次，如果下一个数字和之前保存的数相同，则次数+1，否则-1，因为要找的数字出现的次数比
 * 未出现的数字次数还多，所以要找的数字是最后一次把次数设为1时对应的数字。O(n)
 *
 * @author Dennis
 * @date 2018/7/23
 */
public class Problem29MoreThanHalfNum {

    //判断输入的数组是否超过数组长度的一半
    boolean checkMoreThanHalf(int[] array, int number) {
        int times = 0;
        boolean moreThanHalf = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                times++;
            }
        }
        if (times * 2 < array.length) {
            moreThanHalf = false;
        }
        return moreThanHalf;
    }

    //主方法
    int moreThanHalf(int[] array) {
        if (array == null || array.length <= 0)
            return 0;
        int result = array[0];
        int times = 1;
        for (int i = 1; i < array.length; i++) {
            if (times == 0) {
                result = array[i];
                times = 1;
            } else if (array[i] == result) {
                times++;
            } else {
                times--;
            }
        }
        if (!checkMoreThanHalf(array, result)) {
            result = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2};
        int[] array2 = new int[]{1, 2, 3, 5, 4, 2};
        int[] array3 = new int[]{1, 2, 3, 5, 4, 2};
        int[] array4 = new int[]{1};
        int[] array5 = null;
        Problem29MoreThanHalfNum p29 = new Problem29MoreThanHalfNum();
        System.out.println(p29.moreThanHalf(array1));
        System.out.println(p29.moreThanHalf(array2));
        System.out.println(p29.moreThanHalf(array3));
        System.out.println(p29.moreThanHalf(array4));
        System.out.println(p29.moreThanHalf(array5));
    }

}
