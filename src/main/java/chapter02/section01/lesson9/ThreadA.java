package chapter02.section01.lesson9;

/**
 * @author: deng
 * @datetime: 2020/5/21 2:05 下午
 * @desc:
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
