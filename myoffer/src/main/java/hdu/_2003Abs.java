package hdu;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @class: _2003Abs
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-07-06 18:21
 **/
public class _2003Abs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");
        while (scanner.hasNextDouble()) {
            double abs = Math.abs(scanner.nextDouble());
            System.out.println(format.format(abs));
        }
    }
}
