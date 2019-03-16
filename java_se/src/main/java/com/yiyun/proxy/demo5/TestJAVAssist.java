package com.yiyun.proxy.demo5;

import javassist.*;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestJAVAssist {
    @Test
    public void funHello() throws  Exception{
        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = pool.get("com.yiyun.proxy.demo5.Emp");
        //---------------------
        CtMethod sayHello = ctClass.getDeclaredMethod("sayHello", new CtClass[]{CtClass.intType});
        sayHello.insertBefore("System.out.println(\"Hello\");");
    }
    
    
    
    @Test
    public void funMethod() throws Exception {
        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = pool.get("com.yiyun.proxy.demo5.Emp");
        //---------------------
        CtMethod add = new CtMethod(CtClass.intType, "add",
            new CtClass[]{CtClass.intType, CtClass.intType}, ctClass);
        add.setModifiers(Modifier.PUBLIC);
        add.setBody("{return $1+$2;}");
        ctClass.addMethod(add);
        Class cc = ctClass.toClass();
        Object o = cc.newInstance();
        Method method = cc.getDeclaredMethod("add", int.class, int.class);
        Object invoke = method.invoke(o, 100, 200);
        System.out.println("invoke = " + invoke);
    }

    @Test
    public void funJava() throws Exception {
        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = pool.get("com.yiyun.proxy.demo5.Emp");
        //---------------------
        byte[] bytes = ctClass.toBytecode();
        System.out.println(Arrays.toString(bytes));
        //---------------------
        System.out.println(ctClass.getSimpleName());
        System.out.println(ctClass.getSuperclass());
        System.out.println(ctClass.getInterfaces());
    }


    @Test
    public void fun() throws Exception {
        ClassPool classPool = ClassPool.getDefault();
        CtClass ctClass = classPool.makeClass("com.yiyun.proxy.demo5.Emp");
        //--------creat Attributes---------
        CtField ctField1 = CtField.make("private int num;", ctClass);
        CtField ctField2 = CtField.make("private String name;", ctClass);
        ctClass.addField(ctField1);
        ctClass.addField(ctField2);
        //-------create  method--------
        CtMethod ctMethod1 = CtMethod.make("public int getNum(){return num;}", ctClass);
        CtMethod ctMethod2 = CtMethod.make("public String getName(){return name;}", ctClass);
        ctClass.addMethod(ctMethod1);
        ctClass.addMethod(ctMethod2);
        //-------Constructor----
        CtConstructor ctConstructor = new CtConstructor(
            new CtClass[]{CtClass.intType, classPool.get("java.lang.String")}
            , ctClass);
        ctConstructor.setBody("{this.num=num;this.name=name;}");
        ctClass.addConstructor(ctConstructor);


        ctClass.writeFile("./test");
    }
}
