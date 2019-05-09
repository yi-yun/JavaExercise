package suishou;

import org.junit.Test;

public class InterView {
    @Test
    public void fun1(){
        Integer a=12321;
        int b=12321;
        System.out.println(a==b);
    }
    @Test
    public void fun2(){
        short s=1;
//        s=s+1;
        s=(short) (s+1);
    }
}
