package com.yiyun.clone;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Body implements Cloneable {
    public Head head;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Body newBody = (Body) super.clone();
        newBody.head = (Head) head.clone();
        return newBody;
    }
}

@AllArgsConstructor
@NoArgsConstructor
class Head implements Cloneable {
    public Face face;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Head head = (Head) super.clone();
        head.face = (Face) this.face.clone();
        return head;
    }
}

class Face implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}