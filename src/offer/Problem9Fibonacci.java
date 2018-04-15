package offer;

/**
 * 思路：从下到上计算，根据f0和f1算出f2，f1,f2算出f3，依次类推，不用递归效率会高出很多
 * @auther Dennis
 * @date 2018/4/9
 */
public class Problem9Fibonacci {

    public static long fibonacci(int n){
        long result = 0;
        long preOne = 0;
        long preTwo = 1;
        if(n == 0)
            return preOne;
        if(n == 1)
            return preTwo;
        for (int i = 2; i <= n ; i++) {
            result = preOne + preTwo;
            preOne = preTwo;
            preTwo = result;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibonacci(n));
    }

}
