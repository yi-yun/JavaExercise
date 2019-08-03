package com.yiyun.proxy.mybatis;

/**
 * @class: TargetImpl
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-03 23:34
 **/
public class TargetImpl implements Target {
    @Override
    public void execute() {
        System.out.println("Execute……");
    }
}
