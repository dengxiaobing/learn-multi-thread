package chapter07.section04.lesson1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: deng
 * @datetime: 2020/6/3 5:14 下午
 * @desc:
 */
public class MyThread extends Thread {
    private final SimpleDateFormat sdf;
    private String dateString;

    public MyThread(SimpleDateFormat sdf, String dateString) {
        super();
        this.sdf = sdf;
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try {
            Date dateRef = sdf.parse(dateString);
            String newDateString = sdf.format(dateRef);
            if (!newDateString.equals(dateString)) {
                System.out.println("ThreadName=" + this.getName() + "报错了 日期字符串：" + dateString + " 转换成的日期为：" + newDateString);
            } else {
                System.out.println("ThreadName=" + this.getName() + " 日期字符串：" + dateString + " 转换成的日期为：" + newDateString);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
