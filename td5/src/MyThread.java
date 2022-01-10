import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        String msg = "début";
        Thread t = new Thread() {
      public void run() {
        for(int i =0;i<10000;i++)
        {
            System.out.println(i);
        }
      }
    };

    Thread t2 = new Thread() {
      public void run() {
        for(int i =-1;i>-5100;i--)
        {
            System.out.println(i);
        }
      }
    };
    t.start();
    System.out.println("Zbeub");
    t2.start();

    try {
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(df.format(new Date()) + " fin thread2");

     try {
      t.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(df.format(new Date()) + " fin thread 1");
    
  }

    private static class MonRunnable implements Runnable {

    private long delai;

    public MonRunnable(long delai) {
      this.delai = delai;
    }

    @Override
    public void run() {
      try {
        Thread.sleep(delai);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}