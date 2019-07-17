package Leetcode.easy;

/**
 * Determine whether an integer is a palindrome.
 * An integer is a palindrome when it reads the same backward as forward.
 * <p/>
 * Example 1:
 * Input: 121
 * Output: true
 * <p/>
 * Example 2:
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
 * Therefore it is not a palindrome.
 * <p/>
 * Example 3:
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * <p/>
 * Created by Dennis on 2018/12/26.
 */
public class Problem9PalindromeNumber {

    /**
     * 直接数学方法判断，如果需要考虑溢出情况则加入溢出判断
     * @param x 需要验证的数
     * @return boolean
     */
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int reverse = 0;
        int temp = x;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        return reverse == x;
    }

    public static void main(String[] args) {
        int x = 121;
        int y = -121;
        int z = 120;
        int m = 0;
        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome(y));
        System.out.println(isPalindrome(z));
        System.out.println(isPalindrome(m));
    }

}
