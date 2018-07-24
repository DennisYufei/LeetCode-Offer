package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题34：丑数，只包含2,3,5为因子的数   求从小到大的顺序的第1500个丑数，1为第一个丑数
 * 思路：1、可以直接判断是不是丑数连续除2,3,5如果最后是1则为丑数，不管怎样都需要大量除法运算
 * 2、空间换时间，创建一个数组，里面的数字是排好序的丑数，每个丑数都是前面的丑数乘以2,3,5得到的
 *
 * @auther Dennis
 * @date 2018/7/24
 */
public class Problem34UglyNumber {

    //思路1
    private boolean isUgly(int number) {
        while (number % 2 == 0)
            number /= 2;
        while (number % 3 == 0)
            number /= 3;
        while (number % 5 == 0)
            number /= 5;
        return (number == 1) ? true : false;
    }

    public int getUglyNumber1(int index) {
        if (index < 0)
            return 0;
        int number = 0;
        int ugly = 0;
        while (ugly < index) {
            number++;
            if (isUgly(number)) {
                ugly++;
            }
        }
        return number;
    }

    //思路2
    private int getUglyNumber2(int index) {
        if (index <= 0) {
            return 0;
        }
        //存放丑数
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        int i2 = 0, i3 = 0, i5 = 0;
        while (list.size() < index) {
            int num2 = list.get(i2) * 2;
            int num3 = list.get(i3) * 3;
            int num5 = list.get(i5) * 5;
            //找出最小的丑数，保证是按照从小到大的顺序排列
            int min = min(num2, num3, num5);
            list.add(min);
            //保证最小的数不重复
            if (min == num2)
                i2++;
            if (min == num3)
                i3++;
            if (min == num5)
                i5++;
        }
        //返回第N个丑数
        return list.get(list.size() - 1);
    }

    private int min(int i, int j, int k) {
        int temp = (i < j) ? i : j;
        return (temp < k) ? temp : k;
    }

    public static void main(String[] args) {
        Problem34UglyNumber p34 = new Problem34UglyNumber();
        int index = 13;
        System.out.println(p34.getUglyNumber1(index));
        System.out.println(p34.getUglyNumber2(index));

    }

}
