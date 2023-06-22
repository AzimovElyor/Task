package online.dars.lesson3.task1;

import java.util.concurrent.atomic.AtomicInteger;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable = ()->{
            for(int i = 0; i < 10000; i++){
                counter.increment();
            }
            System.out.println(Thread.currentThread().getName() + " is end");
        };
        for(int i = 0; i < 100; i++){
            new Thread(runnable).start();
        }
        Thread.sleep(2000);
        System.out.println("counter.getCounter() = " + counter.getCounter());
    }
}
class Counter{
    AtomicInteger counter = new AtomicInteger(0);
   public void increment(){
       counter.getAndIncrement();
   }
    public int getCounter(){
        return counter.get();
    }
    public void setCounter(int value){
        counter.getAndSet(value);
    }
}
