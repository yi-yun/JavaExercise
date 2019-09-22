package exam.mine;

import org.junit.Test;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @class: _Main
 * @description: test beike
 * @author: yi-yun
 * @create: 2019-08-10 11:03
 **/
public class _Main {
    @Test
    public void fun() {
        int[] a = {1, 5, 3, 4, 2, 8};
        selectSort(a);
    }

    public void selectSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    
                    index = j;
                }
            }
            //swap a[i] a[index]
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            double sum = n, temp = n;
            int m = scanner.nextInt();
            for (int i = 1; i < m; i++) {
                temp = Math.sqrt(temp);
                sum += temp;
            }
            DecimalFormat format = new DecimalFormat("0.00");
            System.out.println(format.format(sum));
        }

    }
}
