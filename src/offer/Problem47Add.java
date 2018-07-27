package offer;

/**
 * 面试题47：不用加减乘除做加法
 * 思路：
 *
 * @auther Dennis
 * @date 2018/7/27
 */
public class Problem47Add {

    private int Add(int num1, int num2) {
        int sum, carry;
        do {
            sum = num1 ^ num2;
            carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        } while (num2 != 0);
        return num1;
    }

    public static void main(String[] args) {
        int num1 = 2, num2 = 5;
        Problem47Add p47 = new Problem47Add();
        System.out.println(p47.Add(num1, num2));
    }

}
