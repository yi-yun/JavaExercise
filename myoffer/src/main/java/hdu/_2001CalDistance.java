package hdu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _2001CalDistance {
    private static double cal(double a, double b, double c, double d) {
        return Math.sqrt(Math.pow(a - c, 2) + Math.pow(d - b, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a1, b1, c1, d1;
        while (scanner.hasNextDouble()) {
            a1 = scanner.nextDouble();
            b1 = scanner.nextDouble();
            c1 = scanner.nextDouble();
            d1 = scanner.nextDouble();
            double cal = cal(a1, b1, c1, d1);
            DecimalFormat format = new DecimalFormat("0.00");
            System.out.println(format.format(cal));
        }
    }
}
