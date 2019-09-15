package exam.minglve;

import javafx.scene.transform.Scale;
import org.junit.Test;

import java.util.Scanner;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-15 15:42
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        cal(s);
    }

    private static void cal(String s) {
        String[] split = s.split(" ");
        // String[] res = new String[split.length];
        for (int i = split.length - 1; i >= 0; i--) {
            if (i == split.length - 1) {
                System.out.print(split[i]);
            } else {
                System.out.print(" "+split[i]);
            } 
        }
        System.out.println();
    }
    
    @Test
    public void fun() {
        cal("I like beijing.");
    }

}
