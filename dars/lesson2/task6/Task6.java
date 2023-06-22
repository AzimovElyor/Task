package online.dars.lesson2.task6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task6 {
    public static void main(String[] args) throws InterruptedException {
        Bancomat bancomat = new Bancomat();
        Runnable runnable = ()->{
            System.out.println(Thread.currentThread().getName() );
            for(int i = 0; i < 1000; i++){
                bancomat.transfer(10_000);
            }
        };
        for(int i = 0; i < 30; i++){
            new Thread(runnable).start();
        }
        long sum = 10_000 * 1000 * 30;
        Thread.sleep(4000);
        System.out.println(bancomat.getAmount());
        if(999999999 - sum == bancomat.getAmount() ){
            System.out.println("Very nice");
        }
        else System.out.println("Race condition");
    }
}
class Bancomat{
    private long amount = 999999999;
    private Lock lock = new ReentrantLock();
    public void transfer(long money){
        try {
            lock.lock();
            setAmount(getAmount()-money);
        }finally {
            lock.unlock();
        }
    }
    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
