class counterinSynchronizationExample{
    int count = 0 ;
    void increment(){
        synchronized(this){
            count++;
        }
    }

    int getCount(){
        return count;
    }
}

class threadinSynchronizationExample extends Thread{
    counterinSynchronizationExample counter ;
    threadinSynchronizationExample(counterinSynchronizationExample counter){
        this.counter = counter;
    }

    public void run(){
        for (int i=0; i<100 ; i++){
            counter.increment();
        }
    }
}

public class SynchronizationExample{
    public static void main(String args[]) throws InterruptedException{
        counterinSynchronizationExample counter = new counterinSynchronizationExample();

        threadinSynchronizationExample tse1 = new threadinSynchronizationExample(counter);
        threadinSynchronizationExample tse2 = new threadinSynchronizationExample(counter);
        
        tse1.start();
        tse2.start();

        tse1.join();
        tse2.join();

        System.out.println("final count: "+counter.getCount());
    }
}

