package chapter03.section01.lesson5;

/**
 * @author: deng
 * @datetime: 2020/5/25 3:24 下午
 * @desc:
 */
public class ThreadB extends Thread {
    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
