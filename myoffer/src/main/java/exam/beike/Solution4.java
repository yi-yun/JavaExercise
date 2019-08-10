package exam.beike;

import java.util.*;
import java.math.*;
import java.io.*;

public class Solution4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println(0);
            return;
        }
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        long cnt=0;
        long max=Long.MIN_VALUE;
        int index=0;
        for(int i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
                index=i;
            }
        }
        //index 0 n-1
        if(index==0){
            for(int i=1;i<n;i++){
                cnt+=(max-a[i]);
            }
        }

    }
}
