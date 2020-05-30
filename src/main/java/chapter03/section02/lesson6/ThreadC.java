package chapter03.section02.lesson6;

/**
 * @author: deng
 * @datetime: 2020/5/30 12:02 上午
 * @desc:
 */
public class ThreadC extends Thread {

    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        super();
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.bService();
    }

}