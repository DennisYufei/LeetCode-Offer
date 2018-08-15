package offer;

/**
 * 面试题4：在字符串中的每个空格替换成“%20”，例如输入“we are happy.”则输出“we%20are%20happy.”
 * Created by dennis on 2018/3/22.
 */
public class Problem4ReplaceBlank {

    public static String replace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                newStr.append('%');
                newStr.append('2');
                newStr.append('0');
            } else {
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("we are happy");
        System.out.println(replace(str));
    }


}
