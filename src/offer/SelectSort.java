package offer;

/**
 * 直接选择排序：第一轮比较后选出数中最小的元素，然后和第一个记录的位置进行交换
 * Created by Administrator on 2018/4/3.
 */
public class SelectSort {

    public static void selectSort(int a[]) {
        int k, tmp;
        for (int i = 0; i < a.length - 1; i++) {
            k = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[k])
                    k = j;
            }
            if (k != i) {
                tmp = a[k];
                a[k] = a[i];
                a[i] = tmp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = {7, 9, 1, 13, 5, 5, 2, -1};
        selectSort(a);
    }

}
