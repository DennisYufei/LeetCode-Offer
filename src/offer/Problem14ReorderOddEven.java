package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 思路1：调整数组顺序使得奇数放在偶数前面，双指针法,一个指针指向头一个指针指向末尾，然后奇数和偶数对换位置
 * 思路2：空间换时间，用2个ArrayList，一个装奇数，一个装偶数，然后合并两个ArrayList，然后再返回数组
 * @author Dennis
 * @date 2018/4/16
 */
public class Problem14ReorderOddEven {

    private boolean isEven(int a) {
        return a % 2 == 0;
    }

    public void order(int[] array) {
//        if (array == null && array.length == 0) {
//            return;
//        }
//        int start = 0;
//        int end = array.length - 1;
//        while (start < end) {
//            while (start < end && !isEven(array[start])) {
//                start++;
//            }
//            while (start < end && isEven(array[end])) {
//                end--;
//            }
//            if(start<end){
//                int temp = array[start];
//                array[start] = array[end];
//                array[end] = temp;
//            }
//        }
        if(array == null){
            throw new IllegalArgumentException("数组为空");
        }
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0;i < array.length;i++){
            if(array[i] % 2 == 1){
                list1.add(array[i]);
            }else{
                list2.add(array[i]);
            }
        }
        list1.addAll(list2);
        for(int i = 0;i<array.length;i++){
            array[i] = list1.get(i);
        }
    }

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8};
        Problem14ReorderOddEven p14 = new Problem14ReorderOddEven();
        p14.order(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

}
