
// class threadmethods extends Thread{
//     boolean suspendflag;
//     boolean stopflag;
//     threadmethods(){
//         suspendflag = false;
//         stopflag = false;
//         start();
//     }

//     public void run(){
//         try{
//             while(!stopflag){
//                 synchronized(this){
//                     while(suspendflag){
//                         wait();
//                     }
//                 }               
//                 System.out.println(Thread.currentThread().getName()+" is running.");
//                 Thread.sleep(1000);
//             }

//         }
//         catch(Exception e){
//             System.out.println("Exception caught");
//         }
//         System.out.println(Thread.currentThread().getName()+" is existing.");
//     }

//     void Suspend(){
//         suspendflag = true;
//     }

//     void Stop(){
//         stopflag = true;
//         Resume();
//     }

//     synchronized void Resume(){
//         suspendflag = false;
//         notify();
//     }
    
// }

// public class Threadoperation{
//     public static void main(String args[]){
//         threadmethods tm1 = new threadmethods();
//         tm1.setName("Thread 1");

//         try{
//             Thread.sleep(2000);
//             tm1.Suspend();
//             System.out.println(tm1.getName()+" is suspended.");
//             Thread.sleep(2000);
//             tm1.Resume();
//             System.out.println(tm1.getName()+" is resumed.");
//             Thread.sleep(2000);
//             tm1.Stop();
//             System.out.println(tm1.getName()+" is stopped.");
//         }
//         catch(Exception e){
//             e.printStackTrace();
//         }
//     }
// }
