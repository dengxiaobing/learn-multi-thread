package chapter03.section01.lesson7;

/**
 * @author: deng
 * @datetime: 2020/5/25 4:19 下午
 * @desc:
 */
public class ThreadA extends Thread {
    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
