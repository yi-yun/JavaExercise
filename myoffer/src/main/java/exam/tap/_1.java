package exam.tap;

import org.junit.Test;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-29 19:51
 **/
public class _1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        String[] b = new String[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.next();
        }
        cal(s, n, b);
    }

    private static void cal(String s, int n, String[] ss) {
        TreeSet<String> treeSet = new TreeSet<>((o1, o2) -> {
            int a = o1.length();
            int b = o2.length();
            if (a > b) {
                int i = 0;
                for (; i < b; i++) {
                    int index2 = find(s, o2.charAt(i));
                    int index1 = find(s, o1.charAt(i));
                    if (index2 < index1) {
                        return 1;
                    } else if (index2 > index1) {
                        return -1;
                    }
                }
                if (i == b) {
                    return 1;
                }
            } else if (a < b) {
                int i = 0;
                for (; i < a; i++) {
                    int index2 = find(s, o2.charAt(i));
                    int index1 = find(s, o1.charAt(i));
                    if (index2 < index1) {
                        return 1;
                    } else if (index2 > index1) {
                        return -1;
                    }
                }
                if (i == a) {
                    return -1;
                }
            } else {
                int i = 0;
                for (; i < a; i++) {
                    int index2 = find(s, o2.charAt(i));
                    int index1 = find(s, o1.charAt(i));
                    if (index2 < index1) {
                        return 1;
                    } else if (index2 > index1) {
                        return -1;
                    }
                }
                if (i == a) {
                    return 0;
                }
            }
            return 1;
        });
        for (int i = 0; i < ss.length; i++) {
            treeSet.add(ss[i]);
        }
        print(treeSet);
    }

    @Test
    public void fun2() {
        String s = "qazxswedcvfrtgbnhyujmkilop";
        String[] ss = new String[4];
        ss[0] = "oooooo";
        ss[1] = "xwcvf";
        ss[2] = "xartnhg";
        ss[3] = "xatghs";
        cal(s, ss.length, ss);
    }

    @Test
    public void fun1() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("aaa");
        treeSet.add("eee");
        treeSet.add("abc");
        treeSet.add("ddd");
        print(treeSet);
    }

    private static int find(String s, char charAt) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == charAt) {
                return i;
            }
        }
        return 0;
    }

    @Test
    public void fun3() {
        String s = new String();
        TreeSet<String> treeSet = new TreeSet<>((o1, o2) -> {
            int a = o1.length();
            int b = o2.length();
            if (a > b) {
                int i = 0;
                for (; i < b; i++) {
                    int index2 = find(s, o2.charAt(i));
                    int index1 = find(s, o1.charAt(i));
                    if (index2 < index1) {
                        return 1;
                    } else if (index2 > index1) {
                        return -1;
                    }
                }
                if (i == b) {
                    return 1;
                }
            } else if (a < b) {
                int i = 0;
                for (; i < a; i++) {
                    int index2 = find(s, o2.charAt(i));
                    int index1 = find(s, o1.charAt(i));
                    if (index2 < index1) {
                        return 1;
                    } else if (index2 > index1) {
                        return -1;
                    }
                }
                if (i == a) {
                    return -1;
                }
            } else {
                int i = 0;
                for (; i < a; i++) {
                    int index2 = find(s, o2.charAt(i));
                    int index1 = find(s, o1.charAt(i));
                    if (index2 < index1) {
                        return 1;
                    } else if (index2 > index1) {
                        return -1;
                    }
                }
                if (i == a) {
                    return 0;
                }
            }
            return 1;

        });

        treeSet.add("oooooo");
        treeSet.add("xwcvf");
        treeSet.add("xartnhg");
        treeSet.add("xatghs");
        print(treeSet);
    }


    public static void print(Set<String> set) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
