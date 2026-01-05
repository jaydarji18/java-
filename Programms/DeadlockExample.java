// //deadlock occurance

// class resource{
//     resource anotherres;
//     public synchronized void acquire(resource anotherres){
//         System.out.println(Thread.currentThread().getName() +" acquired "+ this);
//         try{
//             Thread.sleep(2000);
//         }
//         catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//         System.out.println(Thread.currentThread().getName() +" is waiting to acquire "+ anotherres);
//     }
// }


// class resourceuse extends Thread{
//     resource res1, res2;

//     resourceuse(resource res1,resource res2){
//         this.res1 = res1;
//         this.res2 = res2;
//     }

//     public void run(){
//         res1.acquire(res2);
//     }
// }
 
// public class DeadlockExample{
//     public static void main(String args[]){
//         resource r1 = new resource();
//         resource r2 = new resource();
        
//         resourceuse ru1 = new resourceuse(r1,r2);
//         resourceuse ru2 = new resourceuse(r2,r1);

//         ru1.setName("Thread 1");
//         ru2.setName("Thread 2");

//         ru1.start();
//         ru2.start();
//     }
// }

// deadlock avoidance
class resource{
    public void acquire(resource anotherres) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " acquired lock on " + this);
            synchronized (anotherres) {
                System.out.println(Thread.currentThread().getName() + " acquired lock on " + anotherres);
                
            }
        }
    }
}

class resourceuse extends Thread{
    resource res1, res2;

    resourceuse(resource res1,resource res2){
        this.res1 = res1;
        this.res2 = res2;
    }

    public void run(){
        res1.acquire(res2);
    }
}
 
public class DeadlockExample{
    public static void main(String args[]){
        resource r1 = new resource();
        resource r2 = new resource();
        
        resourceuse ru1 = new resourceuse(r1,r2);
        resourceuse ru2 = new resourceuse(r1,r2);

        ru1.setName("Thread 1");
        ru2.setName("Thread 2");

        ru1.start();
        ru2.start();
    }
}

