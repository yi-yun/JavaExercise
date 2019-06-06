package maoyan;

import org.junit.Test;

public class _1_NM {
    public long fun(long n,long m){
        if (m==0&&n!=0) return 1;
        if (n==0) return 0;
        if (n==1) return 1;
        if (m==1)return n;
        if (m==2)return n*n;
        int sum=1;
        if (m%2==0){
            long a=fun(n,m/2);
            sum*=(a*a);
        }else {
            long a=fun(n,(m-1)/2);
            sum*=(a*a*n);
        }
        return sum;
    }
    @Test
    public void testfun(){
        long fun = fun(18,4 );
        System.out.println("fun = " + fun);
    }
}
