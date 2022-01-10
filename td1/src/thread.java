public class ThreadSol1 {

  public static void main(String[] args) {
    Thread t = new Thread() {
      public void run() {
        System.out.println("Work un progress");
      }
    };
    t.start();
  }
}

public class ThreadSol2 extends Thread {

  @Override
  public void run() {
    System.out.println("Work in progress ");
  }
}

public class TestThreadexentedthreard {

  public static void main(String[] args) {
    Threadsol2 t = new ThreadSol2();
    t.start();
 }
}

public class solrunnable implements Runnable {

  @Override
  public void run(){
    System.out.println("Am i right ? ");
  }
}