package book.offer;

import org.junit.Test;

//Hungry
public class _1_Single {
    private static _1_Single instance = new _1_Single();

    private _1_Single() {
    }

    public static _1_Single getInstance() {
        return instance;
    }

    @Test
    public void fun1() {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(_1_Single.getInstance().hashCode());
            }).start();
        }
    }
}

//slug not thread
class SingleSlug {
    private static SingleSlug instance = null;

    private SingleSlug() {
    }

    public static SingleSlug getInstance() {
        if (instance == null) {
            instance = new SingleSlug();
        }
        return instance;
    }

    public static SingleSlug getInstanceTest() {
        if (instance == null) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new SingleSlug();
        }
        return instance;
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(SingleSlug.getInstanceTest().hashCode());
            }).start();
        }
    }
}

//double check
class SingleDoucheck{
    private static volatile SingleDoucheck instaence=null;
    private SingleDoucheck(){}
    public static SingleDoucheck getInstance(){
        if (instaence==null){
            synchronized (SingleDoucheck.class){
                if (instaence==null)
                    instaence=new SingleDoucheck();
            }
        }
        return instaence;
    }
}
