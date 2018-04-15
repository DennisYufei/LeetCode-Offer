package offer;

/**
 * 求数值的整数次方,需要考虑全面
 * 1、0为底时负数次幂无意义，0为指数值为1,1为指数值为其本身
 * 2、指数为负数时，注意为倒数
 * 3、计算机中判断相等时考虑精度的问题，自己定义equals方法
 *
 * @auther Dennis
 * @date 2018/4/15
 */
public class Problem11Power {

    private boolean equal(double num1, double num2) {
        if (num1 - num2 > -0.0000001 && num1 - num2 < 0.0000001) {
            return true;
        } else {
            return false;
        }
    }

    private double powerWithExponent(double base, int exponent) {
        if (exponent == 0)
            return 1;
        if (exponent == 1)
            return base;
        double result = 1.0;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    public double power(double base, int exponent) throws Exception {
        double result = 0.0;
        if (equal(base, 0.0) && exponent < 0) {
            throw new Exception("0的负数次幂没有意义");
        }
        if (exponent < 0) {
            result = 1.0 / powerWithExponent(base, -exponent);
        } else {
            result = powerWithExponent(base, exponent);
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        Problem11Power p11 = new Problem11Power();
        System.out.println(p11.power(2.0, 3));
    }
}
