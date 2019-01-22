package com.yiyun.Spring.DI.setterwired;

import java.util.*;

public class CollectionBean1 {
    private Set<String> set;
    private List<String> list;
    private String[] array;
    private Map<String,String> map;
    private Properties properties;

    @Override
    public String  toString() {
        return "CollectionBean1{" +
                "set=" + set +
                ", list=" + list +
                ", array=" + Arrays.toString(array) +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
