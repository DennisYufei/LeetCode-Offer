package Leetcode.easy;

/**
 * 典型的斐波那契数列
 * @author Dennis
 * @date 2019/7/24 10:06
 */
public class Problem70ClimbingStairs {
    public int climbStairs(int n) {
        int one = 1;
        int two = 2;
        if (n == 1)
            return one;
        if (n == 2)
            return two;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = one + two;
            one = two;
            two = result;
        }
        return result;
    }

    public static void main(String[] args) {
        Problem70ClimbingStairs p = new Problem70ClimbingStairs();
        System.out.println(p.climbStairs(5));
    }
}
