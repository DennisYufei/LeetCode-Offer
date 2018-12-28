package Leetcode.easy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 * Created by Dennis on 2018/12/28.
 */
public class LongestCommonPrefix {

    /**
     * 思路：因为是查找相同字符串的前缀，则运用String类中的indexOf(str)方法，
     * 返回指定子字符串在此字符串中第一次出现处的索引。
     * @param strs 输入的字符串数组
     * @return String
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String pre = strs[0];
        int i = 1;
        while (i < strs.length) {
            while (strs[i].indexOf(pre) != 0) //返回指定子字符串在此字符串中第一次出现处的索引。
                pre = pre.substring(0, pre.length() - 1);
            i++;
        }
        return pre;
    }

    public static void main(String[] args) {
        String [] strs = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

}
