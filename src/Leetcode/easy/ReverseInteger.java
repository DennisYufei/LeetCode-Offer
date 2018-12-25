package Leetcode.easy;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.

 * Example 1:
 * Input: 123
 * Output: 321

 * Example 2:
 * Input: -123
 * Output: -321

 * Example 3:
 * Input: 120
 * Output: 21

 * Created by Administrator on 2018/12/25.
 */
public class ReverseInteger {

    /**
     * 思路：关键点是如何判断溢出，每次计算新的结果时，再用逆运算判断与上一次循环的结果是否相同，不同就溢出
     *
     * @param x 需要反转的32位有符号整数
     * @return int
     */
    public static int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int tail = x % 10;
            int newRes = res * 10 + tail;
            if ((newRes - tail) / 10 != res)
                return 0;
            res = newRes;
            x = x / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int x = 123;
        int y = -123;
        int z = 120;
        int m = -120;
        System.out.println(reverse(x));
        System.out.println(reverse(y));
        System.out.println(reverse(z));
        System.out.println(reverse(m));
    }

}
