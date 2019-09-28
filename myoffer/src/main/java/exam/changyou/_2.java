package exam.changyou;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-25 21:11
 **/
public class _2 {
    Thread thread1 = new Thread(() -> {
        synchronized (this) {
            for (int i = 1; i < 53; i++) {
                System.out.print(i);
                if (i % 2 == 0) {
                    this.notify();
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    });
    Thread thread2 = new Thread(() -> {
        synchronized (this) {
            for (int i = 0; i < 26; i++) {
                //控制空格
                if (i != 25) {
                    System.out.print((char) (65 + i)+" ");
                } else {
                    System.out.print((char) (65 + i));
                } 
                
                this.notify();
                try {
                    Thread.sleep(1);
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    });

    public static void main(String[] args) {
        _2 a = new _2();
        a.thread1.start();
        a.thread2.start();
    }
}
