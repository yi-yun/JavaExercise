package com.yiyun.container.link;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class MyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;
    
    public boolean add(T e){
        Node<T> tNode = new Node<>(e);
        size++;
        if (first==null){
            first=last=tNode;
            return true;
        }else {
            tNode.setPre(last);
            last.setNext(tNode);
            last=tNode;
            return true;
        }
    }

    public Node<T> get(int index){
        if (index<0||index>size-1){
            throw  new RuntimeException("index illegal");
        }
        return node(index);
    }
    private Node<T> node(int index){
        Node<T> temp=null;
        if (index<(size>>1)){
            temp=first;
            for (int i=0;i<index;i++){
                temp=temp.getNext();
            }
        }else {
            temp=last;
            for (int i=size-1;i>index;i--){
                temp=temp.getPre();
            }
        }
        return temp;
    }
    public T remove(int index){
        if (index<0 || index>size-1){
            throw new RuntimeException("index illegal");
        }
        Node<T> temp=node(index);
        T element = temp.getElement();
        Node<T> pre = temp.getPre();
        Node<T> next = temp.getNext();
        if (pre==null){
            first=next;
        }else {
            pre.setNext(next);
            temp.setPre(null);
        }
        
        if (next==null){
            last=null;
        }else {
            next.setPre(pre);
            temp.setNext(null);
        }
        temp.setElement(null);
        size--;
        return element;
    }
    public void add(int index,T ele){
        if (index<0 || index>size-1){
            throw new RuntimeException("index illegal");
        }
        Node<T> temp=node(index);
        Node<T> tNode = new Node<>(ele);
        Node<T> pre = temp.getPre();
        Node<T> next = temp.getNext();
        if (pre==null){
            first.setPre(tNode);
            tNode.setNext(first);
            first=tNode;
        }else if (next==null){
            last.setNext(tNode);
            tNode.setPre(last);
            last=tNode;
        }else {
            pre.setNext(tNode);
            tNode.setPre(pre);
            
            next.setPre(tNode);
            tNode.setNext(next);
        }
        size++;
    }
    @Override
    public String toString() {
        Node<T> temp=first;
        StringBuilder sb=new StringBuilder("[");
        while (temp!=null){
            sb.append(temp.getElement().toString()+",");
            temp=temp.getNext();
        }
        
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }
}
