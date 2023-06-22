package task1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

    /*    ExecutorService executorService = Executors.newFixedThreadPool(5);
        Runnable runnable = ()->{
            System.out.println(Thread.currentThread().getName() + " is start");
            for(int i = 0; i < 500; i++){
                System.out.println(Thread.currentThread() + " -> " + i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName() + " is end");

        };
        for(int i = 0; i < 10; i++){
            executorService.execute(runnable);
        }*/
    }
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        // 2, 2, ,3, 5, 6, 7, 9 10
        int num = cost.length % 2 == 0 ? 1 : 2;
        int sum = 0;
        for(int i = cost.length -1; i >= num; i-=3){
            sum += cost[i] + cost[i -1];
        }
        return sum;
    }
}
