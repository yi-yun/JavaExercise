package exam.meituan;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-11 14:58
 **/
public class _1 {
    static String[] d = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾"};
    static String[] y = {"亿", "万", "千", "佰"};
    static String[] e = {"元", "角", "分", "整"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        cal(next);

    }

    private static void cal(String next) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < next.length() - 1; i++) {
            sb.append(next.charAt(i));
        }
        String s = sb.toString();
        String[] split = s.split(",");
        String[] source = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            source[i] = split[i].replaceAll("\"", "");
        }
        // System.out.println(source);
        qwe(source);
    }

    private static void qwe(String[] source) {
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < source.length; i++) {
            String s = source[i];
            int index = s.indexOf('.');
            if (index == -1) {

            } else {
                asd(s);
            }
        }
    }

    //整数
    private static String asd(String s) {
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int at = s.charAt(i) - '0';
            sb.append(d[at]);
            
        }
        return sb.toString();
    }

    @Test
    public void fun() {
        // cal("[\"200.00\",\"201.15\",\"1015\",\"200001010200\"]");
        System.out.println(asd("1000"));
    }
}
