package offer;

/**
 * 面试题4：在字符串中的每个空格替换成“%20”，例如输入“we are happy.”则输出“we%20are%20happy.”
 * 思路：
 * 1. 当然，你会说一个replaceAll(' ', '%20')就可以搞定，但是这题目就是想让你做O(n)复杂度的方法
 * 2. 从前往后扫描字符串，碰到一个空格就做替换，但是每碰到一个空格，后面的字符都会往后移一次，复杂度为o(n²)
 * 3. 双指针法：先遍历一遍字符串，统计出字符串中的空格总数，然后可以计算出替换后字符串的总长度，每替换一个空格，
 *            长度增加2，注意字符串结尾有“\0”。
 *            p1指向原始字符串的末尾，p2指向替换后的字符串末尾，如图和代码注释分析：
 * Created by dennis on 2018/3/22.
 */
public class Problem4ReplaceBlank {

    public static void replace(char[] string, int length) {
        if (string == null || length < 0) {
            return;
        }
        int originalLength = 0;
        int numOfBlank = 0;
        int i = 0;
        while (string[i] != '\0'){
            originalLength++;
            if(string[i] == ' '){
                numOfBlank ++;
            }
            i++;
        }
        int newLength = originalLength + numOfBlank * 2;
        if(newLength > length){
            return;
        }
        while(originalLength >= 0 && newLength > originalLength){
            if(string[originalLength] == ' '){
                string[newLength --] = '0';
                string[newLength --] = '2';
                string[newLength --] = '%';
            }else {
                string[newLength --] = string[originalLength];
            }
            -- originalLength ;
        }
        System.out.println(string);
    }

    public static void main(String[] args) {
        String s = "we are happy.\0            ";
        char string[] = s.toCharArray();
        System.out.print(string);
        System.out.println(string.length);
        replace(string, 100);
    }


}
