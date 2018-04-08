package offer;

/**
 * 快速排序：高效的排序算法，采用分而治之的思想，大的拆分为小的，小的拆分为更小的，一趟排序后，原序列分为两部分，前面
 * 一部分比后面一部分所有记录都要小，再一次对前后两部分记录进行快速排序，递归该过程
 * Created by dennis on 2018/4/3.
 */
public class QuickSort {

    public static void quickSort(int a[], int s, int t) {
        int i = s;
        int j = t;
        int tmp;
        if (s < t) {
            tmp = a[s];
            while (i != j) {
                while (j > i && a[j] >= tmp)
                    j--;
                a[i]=a[j];
                while (i<j && a[i]<=tmp)
                    i++;
                a[j]= a[i];
            }
            a[i] = tmp;
            quickSort(a,s,i-1);
            quickSort(a,i+1,t);
        }
    }

    public static void main(String[] args) {
        int a[] = {7, 9, 1, 13, 5, 5, 2, -1};
        quickSort(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

}
