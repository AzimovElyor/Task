package online.dars.lesson1.task7;

import java.util.Random;

public class ThreadPriority {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            for(int i = 0; i < 10; i++){
                System.out.println(Thread.currentThread().getName() + "-> " + i);
            }
            System.out.println(Thread.currentThread().getName() + " priority is -> " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        };
        Thread t1 = new Thread(runnable, "Thread 1");
        Thread t2 = new Thread(runnable, "Thread 2");
        Thread t3 = new Thread(runnable, "Thread 3");
        t1.setPriority(new Random().nextInt(1,11));
        t2.setPriority(new Random().nextInt(1,11));
        t3.setPriority(new Random().nextInt(1,11));
        t1.start();
        t2.start();
        t3.start();
        System.out.println();
    }
    public void rotate(int[] nums, int k) {
        if(!(nums.length < k)){
            int[] massiv = new int[nums.length];
            int index = 0;
            for(int i = nums.length-k; i < nums.length; i++){
                massiv[index] = nums[i];
                index++;
            }
            for(int i = 0; i < nums.length-k; i++){
                massiv[index] = nums[i];
                index++;
            }
            System.arraycopy(massiv, 0, nums, 0, massiv.length);
        }
    }

}
