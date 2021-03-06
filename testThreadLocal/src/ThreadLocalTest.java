public class ThreadLocalTest {

    static ThreadLocal<String> localVar = new ThreadLocal<>();

    static void print(String str) {
        //打印当前线程中本地内存中本地变量的值
        System.out.println(str + " :" + localVar.get());
        //清除本地内存中的本地变量
        localVar.remove();
    }

    public static void main(String[] args) {
        Thread t1  = new Thread(new Runnable() {
            @Override
            public void run() {
                //设置线程1中本地变量的值
                localVar.set("localVar1");
                //调用打印方法
                print("thread1");
                //打印本地变量
                System.out.println("after 1 remove : " + localVar.get());
            }
        });

        Thread t2  = new Thread(new Runnable() {
            @Override
            public void run() {
                //设置线程1中本地变量的值
                localVar.set("localVar2");
                //调用打印方法
                print("thread2");
                //打印本地变量
                System.out.println("after 2 remove : " + localVar.get());
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                localVar.set("localVar3");
                print("thread3");
                System.out.println("after 3 remove : "+localVar.get());
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                localVar.set("localVar4");
                print("thread4");
                System.out.println("after 4 remove : "+localVar.get());
            }
        });
        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                localVar.set("localVar5");
                print("thread5");
                System.out.println("after 5 remove : "+localVar.get());
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
