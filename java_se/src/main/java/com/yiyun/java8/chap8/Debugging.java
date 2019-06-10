package com.yiyun.java8.chap8;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Debugging {
    @Test
    public void testComparing() throws Exception{
//        Point point = new Point(10, 12);
//        Point point1 = new Point(20, 31);
    }

    public static void main(String[] args) {
        List<Point> points = Arrays.asList(new Point(12, 2), null);
        points.stream().map(Point::getX).forEach(System.out::println);
    }
}

@Getter
@AllArgsConstructor
@Setter
class Point implements Comparable{
    private final int x;
    private final int y;

    public Point moveRightBy(int x) {
        return new Point(this.x + x, y);
    }
    
    public final static Comparator<Point> compareByXAndThenY =
        Comparator.comparing(Point::getX).thenComparing(Point::getY);

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
