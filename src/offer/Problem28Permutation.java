package offer;

/**
 * 面试题28：字符串的排列，给一个字符串打印出来所有排列
 * 思路：1、首先求出所有可能出现在第一个位置的字符，把第一个字符和后面所有的字符交换
 *      2、固定第一个字符，从第二个字符开始与后面交换，是个递归的过程
 * Created by Dennis on 2018/6/24.
 */
public class Problem28Permutation {

    public void swap(char[] arr, int idx1, int idx2) {
        char temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public void permutation(char[] arr, int index, int size) {
        if (index == size) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        } else {
            for (int i = index; i < size; i++) {
                if (i != index && arr[i] == arr[index])
                    continue;
                swap(arr, i, index);
                permutation(arr, index + 1, size);
                swap(arr, i, index);
            }
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        char[] chs = str.toCharArray();
        Problem28Permutation test = new Problem28Permutation();
        test.permutation(chs, 0, 3);
    }
}
