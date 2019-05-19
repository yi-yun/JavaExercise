package book.offer;

import org.junit.Test;

import java.io.*;

//Hungry
public class _2_Single {
    private static _2_Single instance = new _2_Single();

    private _2_Single() {
    }

    public static _2_Single getInstance() {
        return instance;
    }

    @Test
    public void fun1() {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(_2_Single.getInstance().hashCode());
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
class SingleDoucheck {
    private static volatile SingleDoucheck instaence = null;

    private SingleDoucheck() {
    }

    public static SingleDoucheck getInstance() {
        if (instaence == null) {
            synchronized (SingleDoucheck.class) {
                if (instaence == null)
                    instaence = new SingleDoucheck();
            }
        }
        return instaence;
    }
}

//inner holder but no in serizalize like below
class SingleHolder {
    private static class Holder {
        private static SingleHolder instance = new SingleHolder();
    }

    private SingleHolder() {
    }

    public static SingleHolder getInstance() {
        return Holder.instance;
    }
}

class SingleHolderSerializable implements Serializable {

    private static final long serialVersionUID = 2905163163271722130L;

    private static class Holder {
        private static SingleHolderSerializable instance = new SingleHolderSerializable();
    }

    private SingleHolderSerializable() {
    }

    public static SingleHolderSerializable getInstance() {
        return Holder.instance;
    }

    public static void main(String[] args) {
        SingleHolderSerializable singleton = SingleHolderSerializable.getInstance();

        File file = new File("MySingleton.txt");

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(singleton);
            fos.close();
            oos.close();
            System.out.println(singleton.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            SingleHolderSerializable rSingleton = (SingleHolderSerializable) ois.readObject();
            fis.close();
            ois.close();
            System.out.println(rSingleton.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}

class SingleResolve implements Serializable {

    private static final long serialVersionUID = 8396313380667197389L;

    private static class MySingletonHandler {
        private static SingleResolve instance = new SingleResolve();
    }

    private SingleResolve() {
    }

    public static SingleResolve getInstance() {
        return MySingletonHandler.instance;
    }

    protected Object readResolve() throws ObjectStreamException {
        System.out.println("调用了readResolve方法！");
        return MySingletonHandler.instance;
    }

    public static void main(String[] args) {
        SingleResolve singleton = SingleResolve.getInstance();

        File file = new File("MySingleton.txt");

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(singleton);
            fos.close();
            oos.close();
            System.out.println(singleton.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            SingleResolve rSingleton = (SingleResolve) ois.readObject();
            fis.close();
            ois.close();
            System.out.println(rSingleton.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    
}
class SingleStatic{
    private static SingleStatic instance=null;
    static {
        instance=new SingleStatic();
    }
    private SingleStatic(){
        System.out.println("eager");
    }
    public static SingleStatic getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        
    }
}

enum EnumFactory{
    singletonFactory;
    private SingleEnum instance;
    private EnumFactory(){
        instance=new SingleEnum();
    }
    public SingleEnum getInstance(){
        return instance;
    }

}
class SingleEnum{
    public SingleEnum(){}
}