package nowcoder.offer;

import org.junit.Test;

/**
 * @class: Solution_2
 * @description: 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author: yi-yun
 * @create: 2019-07-13 19:31
 **/
public class Solution_2 {

    @Test
    public void testInsert() {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.insert(1, "233");
    }

    @Test
    public void fun() {
        String we_are_happy = replaceSpace(new StringBuffer("We Are Happy"));
    }

    public String replaceSpace(StringBuffer str) {
        int length = str.length();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            sb.append(str.charAt(i) == ' ' ? "%20" : str.charAt(i));
        }
        return sb.toString();
    }
}
