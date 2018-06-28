package offer;

/**
 * 面试题29：数组中出现次数超过一半的数字
 * 思路：1、可以排序然后找到中位数（O(nlogn)）
 *      2、重复的数字出现的次数比其他所有数字出现的次数的和还要多，则在遍历数组的时候保存两个值，一个是数组中的
 *      数字，一个是次数，如果下个数字和保存的数字相同，则次数+1，不同则-1，如果次数为0，则保存下个数字
 *      然后把次数设为1，要找的数字这是最后一次把次数设为1时对应的数字
 * Created by dennis on 2018/6/28.
 */
public class Problem29MoreThanHalfNum {

    public static void main(String[] args) {
        int [] arr = {1,2,3,2,2,2,5,4,2};
        Problem29MoreThanHalfNum p = new Problem29MoreThanHalfNum();
        System.out.println(p.moreThanHalfNum(arr));
    }

    public Integer moreThanHalfNum(int[] arr){
        if(arr == null){
            return 0;
        }
        int count = 1;
        Integer result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(count == 0){
                result = arr[i];
                count = 1;
            }else if(arr[i] == result){
                count ++;
            }else
                count --;
        }
        if(checkMoreThanHalf(arr, result))
            return result;
        else
            return 0;

    }

    private boolean checkMoreThanHalf(int[] arr, Integer num){
        int times = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                times++;
            }
        }
        if(times * 2 <= arr.length)
            return false;
        else
            return true;
    }


}
