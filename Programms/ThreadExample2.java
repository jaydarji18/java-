
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(2500); // Pause for 1 second
                if(i==5){
                    System.out.println(Thread.currentThread().getName() +":"+ Thread.currentThread().isAlive());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExample2{
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());

        t1.start(); // Start the first thread
        t2.start(); // Start the second thread
    }
}

