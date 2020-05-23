package chapter02.section02.lesson10;

/**
 * @author: deng
 * @datetime: 2020/5/22 9:45 上午
 * @desc:
 */
public class ThreadB extends Thread{
    private MyList myList;

    public ThreadB(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            myList.add("ThreadB" + (i + 1));
        }
    }
}
