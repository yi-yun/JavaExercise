package nowcoder.offer;

/**
 * @class: Solution_12
 * @description: 数值的整数次方
 * @author: yi-yun
 * @create: 2019-07-29 23:31
 **/
public class Solution_12 {
    public double Power(double base, int exponent) {
        if (equal(base, 0)) {
            return 0.0;
        }
        if (exponent == 0) {
            return 1.0;
        }
        if (exponent == 1) {
            return base;
        }
        if (exponent > 0) {
            return mutiply(base, exponent);
        } else {
            return mutiply(1.0 / base, -exponent);
        }
    }

    private boolean equal(double a, double b) {
        if (a - b < 0.000001 && a - b > -0.000001) {
            return true;
        }
        return false;
    }

    private double mutiply(double base, int exponent) {
        double sum = 1;
        for (int i = 0; i < exponent; i++) {
            sum *= base;
        }
        return sum;
    }
}
