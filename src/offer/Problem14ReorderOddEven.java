package offer;

/**
 * 调整数组顺序使得奇数放在偶数前面，双指针法,一个指针指向头一个指针指向末尾，然后奇数和偶数对换位置
 *
 * @author Dennis
 * @date 2018/4/16
 */
public class Problem14ReorderOddEven {

    private boolean isEven(int a) {
        return a % 2 == 0;
    }

    public void order(int[] array) {
        if (array == null && array.length == 0) {
            return;
        }
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            while (start < end && !isEven(array[start])) {
                start++;
            }
            while (start < end && isEven(array[end])) {
                end--;
            }
            if(start<end){
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
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
