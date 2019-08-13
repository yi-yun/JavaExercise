package exam.caifu;

import org.junit.Test;

/**
 * @class: _3
 * @description: 面试题
 * @author: yi-yun
 * @create: 2019-08-13 17:32
 **/
public class _3 {
    @Test
    public void fun() {
        String build = build("DongFang", "CaiFU");
    }

    // str去前两个 str2 后四个
    // 六个字附构造新字符串，足够健壮
    public String build(String a, String b) {
        //判断 字符串a 是否为空,长度是否够2
        //b 不为空，长度是否够四
        if (a == null || b == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (a.length() >= 2 && b.length() >= 4) {
            sb.append(a.charAt(0));
            sb.append(a.charAt(1));
            char[] tmp = b.toCharArray();
            int length = b.length();
            sb.append(tmp[length - 4]);
            sb.append(tmp[length - 3]);
            sb.append(tmp[length - 2]);
            sb.append(tmp[length - 1]);
            return sb.toString();
        }
        return null;
    }
}
