package chapter04.section02.lesson3;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author: deng
 * @datetime: 2020/6/1 4:12 下午
 * @desc:
 */
public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        try {
            lock.readLock().lock();
            System.out.println("获得读锁" + Thread.currentThread().getName()
                    + " " + System.currentTimeMillis());
            Thread.sleep(10000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }

    public void write() {
        try {
            lock.writeLock().lock();
            System.out.println("获得写锁" + Thread.currentThread().getName()
                    + " " + System.currentTimeMillis());
            Thread.sleep(10000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }


}
