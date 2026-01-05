// Thread implementation by extending thread class
class Mythread extends Thread{
    public void run(){
        for(int i = 1; i<=5 ; i++){
            System.out.println(Thread.currentThread().getName() +" : "+i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExample1{
    public static void main(String[] args) {
        Mythread thread1 = new Mythread();
        Mythread thread2 = new Mythread();

        Thread thread3 = new Thread(() -> {
            for(int i=1 ; i<=5 ; i++){
                System.out.println(Thread.currentThread().getName()+" : "+i);
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
            
        },"Thread-2");
        thread3.start();

        thread1.setPriority(1);
        thread1.start();
        thread2.setPriority(3);
        thread2.start();
    }
}

