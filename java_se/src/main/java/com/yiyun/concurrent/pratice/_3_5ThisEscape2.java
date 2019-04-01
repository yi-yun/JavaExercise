package com.yiyun.concurrent.pratice;

public class _3_5ThisEscape2 {

    //注意 registerListen 的位置
    private final EventListener listener;

    private  _3_5ThisEscape2() {
        listener = new EventListener() {
            @Override
            public void onEvent(Event e) {
                doSomething(e);
            }
        };
    }

    void doSomething(Event e) {

    }


    public static _3_5ThisEscape2 newInstance(EventSource source) {
        _3_5ThisEscape2 escape2 = new _3_5ThisEscape2();
        source.registerListener(escape2.listener);
        return escape2;
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
