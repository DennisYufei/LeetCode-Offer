package offer;

/**
 * 冒泡排序: 外层循环控制比较次数，内层循环比较两个数的大小，看是否交换
 * Created by dennis on 2018/4/3.
 */
public class BubbleSort {

    public static void bubbleSort(int a[]) {
        int tmp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = {7, 9, 1, 13, 5, 5, 2, -1};
        bubbleSort(a);
    }


}
