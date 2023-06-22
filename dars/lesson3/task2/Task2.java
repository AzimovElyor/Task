package online.dars.lesson3.task2;

import javax.management.relation.RoleInfoNotFoundException;
import java.util.concurrent.atomic.AtomicLong;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        AtomicLong atomicLong = new AtomicLong(999999999);
        Runnable runnable = ()->{
            for(int i = 0; i < 1000; i++){
                atomicLong.getAndDecrement();
            }
        };
        for(int i = 0; i < 100; i++){
            new Thread(runnable).start();
        }
        Thread.sleep(2000);
        System.out.println(atomicLong);
        System.out.println(999999999 - 100000);
    }
}


