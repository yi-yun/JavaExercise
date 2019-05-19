package com.yiyun;

public enum SingleEnumTest {
    SingleFactory;
    private MySingleton instance;

    SingleEnumTest() {//枚举类的构造方法在类加载是被实例化
         instance = new MySingleton();
    }

    public MySingleton getInstance() {
        return instance;
    }

}

class MySingleton {
    public MySingleton() {
    }
}
