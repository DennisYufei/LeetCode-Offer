package offer;

/**
 * 面试题10：二进制中1的个数
 * 移位效率比除法效率高很多，实际编程中尽可能的用移位代替乘除法
 * 思路：将一个数如x，在x减1后，得到的结果和x的二进制进行“与”运算，得到的结果会把x最右边的一个1变成0，那么一个整数的二进制中
 *      有多少个1就可以进行多少次这样的操作，所以有多少个1就循环多少次。如果直接和1做与运算，那么32位的数就要循环32次，这种方法
 *      不是最优的。
 *
 * @auther Dennis
 * @date 2018/4/9
 */
public class Problem10NumOf1 {

    public static int numOf1(int n) {
        int count = 0;
        while (n != 0) {
            count ++;
            n = (n-1) & n;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numOf1(13));
    }
}
