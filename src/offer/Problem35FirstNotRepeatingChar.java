package offer;

import java.util.LinkedHashMap;

/**
 * 面试题34：第一个只出现一次的字符，如输入“abaccedeff”，输出b
 * 思路：用哈希结构的集合去处理，linkedHashmap，String作为键，int作为值，当遇到相同的时候，int值+1，
 * 最后返回的值就是int为1时的字符
 *
 * @author Dennis
 * @date 2018/7/25
 */
public class Problem35FirstNotRepeatingChar {

    public Character firstNotRepeatingChar(String str) {
        if (str == null) {
            return '0';
        }
        char[] charArray = str.toCharArray();
        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<Character, Integer>();
        for (char c : charArray) {
            if (linkedHashMap.containsKey(c)) {
                linkedHashMap.put(c, linkedHashMap.get(c) + 1);
            } else {
                linkedHashMap.put(c, 1);
            }
        }
        for (char c : linkedHashMap.keySet()) {
            if (linkedHashMap.get(c) == 1) {
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Problem35FirstNotRepeatingChar p35 = new Problem35FirstNotRepeatingChar();
        String str = "abaccedeff";
        System.out.println(p35.firstNotRepeatingChar(str));
    }


}
