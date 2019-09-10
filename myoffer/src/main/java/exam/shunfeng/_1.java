package exam.shunfeng;

import org.junit.Test;

import java.util.Scanner;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-10 16:37
 **/
public class _1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            cal(sc.nextInt());
        }
    }

    private static void cal(int nextInt) {
        int t = (int) Math.sqrt(nextInt / 2.0) * 4;
        while(true)
        {
            if (fun(t) >= nextInt) {
                System.out.println(t);
                break;
            } 
            t++;
        }
    }

    private static int fun(int z) {
        int temp = z / 4;
        if (z % 4 == 0) return 2 * temp * temp;
        else if (z % 4 == 1) return 2 * temp * temp + temp - 1;
        else if (z % 4 == 2) return 2 * temp * temp + 2 * temp;
        else return 2 * temp * temp + 3 * temp;
    }
    
    @Test
    public void fun1() {
        cal(5);
        
    }
}
