package chapter03.section02.lesson5;

/**
 * @author: deng
 * @datetime: 2020/5/30 12:02 上午
 * @desc:
 */
public class ThreadB extends Thread {

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+" b run()");
        try {
            System.out.println("   b run begin timer="
                    + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("   b run   end timer="
                    + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void bService() {
        System.out.println("打印了bService timer=" + System.currentTimeMillis());
    }

}