package com.yiyun.container.map;


public class MyHashMap {
    private MyNode[] table;
    private int size;

    public MyHashMap() {
        table=new MyNode[16];
    }

    public void put(Object key,Object value){
        MyNode myNode = new MyNode();
        myNode.key=key;
        myNode.value=value;
        myNode.hash=myHash(key.hashCode(),table.length);
        myNode.next=null;
        MyNode temp=table[myNode.hash];
        if (temp==null){
            table[myNode.hash]=myNode;
        }else {
            while (temp.next!=null){
                if (temp.key.equals(key)){//重复
                    temp.value=value;
                    return;
                }else {
                    temp=temp.next;
                }
            }
            if (temp.key.equals(key)){
                temp.value=value;
                return;
            }else {
                temp.next=myNode;
            }
        }
        size++;
    }
    private int myHash(int code,int length){
        return code&(length-1);
    }
  
}
