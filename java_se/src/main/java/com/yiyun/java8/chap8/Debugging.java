package com.yiyun.java8.chap8;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.junit.Test;

import java.util.Comparator;

public class Debugging {
    @Test
    public void testComparing() throws Exception{
        
    }
}

@Getter
@AllArgsConstructor
@Setter
class Point {
    private final int x;
    private final int y;

    public Point moveRightBy(int x) {
        return new Point(this.x + x, y);
    }

    public final static Comparator<Point> compareByXAndThenY =
        Comparator.comparing(Point::getX).thenComparing(Point::getY);
}
