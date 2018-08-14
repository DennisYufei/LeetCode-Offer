package offer;

/**
 * 面试题45：约瑟夫环问题
 * 递推公式：last = (last+m) % i
 *
 * @auther Dennis
 * @date 2018/7/27
 */
public class Problem45LastRemaining {

    private int lastRemaining(int n, int m) {
        if (n < 1 || m < 1)
            return -1;
        int last = 0;
        for (int i = 2; i <= n; i++) {
            last = (last + m) % i;
        }
        return last;
    }

    public static void main(String[] args) {
        Problem45LastRemaining p45 = new Problem45LastRemaining();
        System.out.println(p45.lastRemaining(5, 3));
    }


}
