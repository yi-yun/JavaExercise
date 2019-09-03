package exam.vipkid;


import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String lines = scan.nextLine();
        System.out.println(cal1(lines));
    }

    private static int cal1(String lines) {
        String[] arr = lines.split(",");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].trim();
        }
        int result = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (Long.parseLong(arr[i]) + Long.parseLong(arr[j]) == 0 && sb.indexOf(j + "") == -1 && sb.indexOf(i + "") == -1) {
                    sb.append(i + "&" + j);
                    result++;
                }
            }
        }
        return result;
/*        for(String str:arr){
            System.out.println(str);
        }*/
    }

    private static int cal(String a) {
        int cnt = 0;
        String r = a.replaceAll(" ", "");
        String[] s = r.split(",");
        int y = s.length;
        long[] b = new long[y];
        HashSet<Long> set = new HashSet<>();
        for (int i = 0; i < y; i++) {
            b[i] = Long.parseLong(s[i]);
            set.add(b[i]);
        }
        Iterator<Long> iterator = set.iterator();
        while (iterator.hasNext()) {
            Long next = iterator.next();
            if (next < 0 && set.contains(Math.abs(next))) {
                cnt++;
            }
        }
        if (set.contains(0L)) {
            cnt++;
        }
        return cnt;
    }


    @Test
    public void fun() {
        String s = "-4 , 2 , 2, -2, 1  , 4    ,2 ";
        Assert.assertThat(cal1(s), Is.is(cal(s)));
    }
}