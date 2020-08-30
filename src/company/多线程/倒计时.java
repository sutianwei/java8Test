package company.多线程;

import java.text.SimpleDateFormat;
import java.util.Date;

public class 倒计时 {
    public static void main(String args[]) throws Exception {
        Date endtime = new Date(System.currentTimeMillis() + 10 * 1000);
        long end = endtime.getTime();
        while (true) {
            System.out.println(new SimpleDateFormat("mm:ss").format(endtime));
            Thread.sleep(1000);
            if (end - 10000 > endtime.getTime()) {
                break;
            }
        }
    }
}
