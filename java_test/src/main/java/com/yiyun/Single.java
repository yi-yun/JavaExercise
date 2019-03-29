package com.yiyun;

public class Single {
    private static volatile Single single;
    public static Single getInstance(){
        if (single==null){
            synchronized (single){
                if (single==null){
                    single= new Single();
                }
            }
        }
        return single;
    }
    
}
