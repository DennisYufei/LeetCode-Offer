package offer;

/**
 * 直接插入排序：从右到左找a[i]的插入位置，然后将大于a[i]的元素向后移
 * Created by dennis on 2018/4/3.
 */
public class InsertSort {

    public static void insertSort(int a[]) {
        int j, tmp;
        for (int i = 1; i < a.length; i++) {
            tmp = a[i];
            j = i - 1;
            while (j >= 0 && tmp < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = tmp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = {7, 9, 1, 13, 5, 5, 2, -1};
        insertSort(a);
    }

}
