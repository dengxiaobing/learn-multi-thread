package chapter02.section02.lesson7;

/**
 * @author: deng
 * @datetime: 2020/5/21 10:33 下午
 * @desc:
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernameAndPassword("a", "aa");
    }
}
