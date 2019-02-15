package com.yiyun.container.map;


public class MyHashMap<K,V> {
    private MyNode[] table;
    private int size;

    public MyHashMap() {
        table=new MyNode[16];
    }

    public void put(K key,V value){
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

    public V get(K key){
        int i = myHash(key.hashCode(), table.length);
        MyNode temp = table[i];
        while (temp!=null){
            if(temp.key.equals(key)){
                return (V) temp.value;
            }else {
                temp=temp.next;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("{");
        for(MyNode e:table){
            while (e!=null){
                builder.append(e.key+":"+e.value+",");
                e=e.next;
            }
        }
        if(builder.length()-1>0)
            builder.setCharAt(builder.length()-1,'}');
        else return "{}";
        return builder.toString();
    }
}
