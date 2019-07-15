package offer;

/**
 * 面试题32：从1到n整数中1出现的次数，如1--12中包含1 的有1，10,11,12，一共出现了5次
 * 思路：累加1到n中每个整数中1出现的次数，对10求余判断整数的个位数字是不是1，如果大于10就先除以10后再判断 O(nlogn)
 *
 * @author Dennis
 * @date 2018/7/24
 */
public class Problem32NumberOf1 {

    int number(int n) {
        int number = 0;
        while (n != 0) {
            if (n % 10 == 1) {
                number++;
            }
            n = n / 10;
        }
        return number;
    }

    int numberOf1(int n){
        int number = 0;
        for (int i = 1; i <= n; i++) {
            number += number(i);
        }
        return number;
    }


    public static void main(String[] args) {
        Problem32NumberOf1 p32 = new Problem32NumberOf1() ;
        int n = 12;
        System.out.println(p32.numberOf1(n));
    }

}
