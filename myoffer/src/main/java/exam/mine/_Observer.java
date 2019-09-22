package exam.mine;

import java.util.ArrayList;
import java.util.List;

/**
 * @class: _Observer
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-22 14:23
 **/
public class _Observer {
}
interface Observer{
    void actionWakeUp();
}
class Dad implements Observer{
    @Override
    public void actionWakeUp() {
        System.out.println("Dad^");
    }
}
class Child{
    private List<Observer> observers = new ArrayList<>();
    {
        observers.add(new Dad());
    }
}
