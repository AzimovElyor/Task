package online.dars.lesson3.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
       // LinkedList<Integer> list = new LinkedList<>();
        List<Integer> list = Collections.synchronizedList(new LinkedList <>());

        for(int i = 0; i < 10000; i++){
            list.add(i);
        }
        Runnable runnable = ()->{
            for (int  i= 0 ; i < 5000; i++){
                list.remove(Integer.valueOf(i));
            }
            System.out.println(Thread.currentThread().getName() + " is end");
        };
        Runnable runnable1 = ()->{
            for(int i = 5000; i < 10000; i++){
                list.remove(Integer.valueOf(i));
            }
            System.out.println(Thread.currentThread().getName() + " is end");
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable1);
        t1.start();
        t2.start();
        Thread.sleep(2000);
        System.out.println(list.size());

    }
}
