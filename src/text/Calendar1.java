package text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar1 {
    public static void main(String[] args) {
        ClockThread clockThread = new ClockThread();
        clockThread.start();


    }
}

class ClockThread extends Thread {
    @Override
    public void run() {
        super.run();
        while (true) {
            Date time = new Date();
            SimpleDateFormat tt =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String a =tt.format(time);
          int num=  a.lastIndexOf(":");
          String str=a.substring(num+1,a.length());


            System.out.println("我是你爹");
            System.out.println(str);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
