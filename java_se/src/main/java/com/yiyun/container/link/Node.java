package com.yiyun.container.link;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class Node<E> {
    private Node<E> pre;
    private Node<E> next;
    private E element;


    public Node(E e) {
        this.element=e;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}
