package com.yiyun.jvm._3;

public class _3_5ThisEscape {
    //我们实例化ThisEscape对象时，会调用source的registerListener方法，
    // 这时便启动了一个线程，而且这个线程持有了ThisEscape对象（调用了对象的doSomething方法），
    // 但此时ThisEscape对象却没有实例化完成（还没有返回一个引用），
    // 所以我们说，此时造成了一个this引用逸出，即还没有完成的实例化ThisEscape对象的动作，
    // 却已经暴露了对象的引用。其他线程访问还没有构造好的对象，可能会造成意料不到的问题
    public _3_5ThisEscape(EventSource eventSource) {
        eventSource.registerListener((Event event) -> doSomething(event));
    }

    void doSomething(Event e) {

    }

    interface EventSource {
        void registerListener(EventListener e);
    }

    interface EventListener {
        void onEvent(Event e);
    }

    interface Event {
    }
}
