package hdu;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @class: _2002CalBall
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-07-06 17:54
 **/
public class _2002CalBall {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextDouble()) {
            double r = scanner.nextDouble();
            double v = r * r * r * 4 / 3 * 3.1415927;
            DecimalFormat format = new DecimalFormat("0.000");
            System.out.println(format.format(v));
        }
    }
}
