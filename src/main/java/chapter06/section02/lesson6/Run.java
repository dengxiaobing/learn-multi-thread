package chapter06.section02.lesson6;

/**
 * @author: deng
 * @datetime: 2020/6/2 3:27 下午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
