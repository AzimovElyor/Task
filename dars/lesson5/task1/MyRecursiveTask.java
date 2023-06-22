package online.dars.lesson5.task1;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Integer> {
    private double[] number;
    private int from;
    private int to;
    private int limit = 100;

    public MyRecursiveTask(double[] number, int from, int to) {
        this.number = number;
        this.from = from;
        this.to = to;
    }

    @Override
    protected Integer compute() {
        if(to-from < limit){
            int count = 0;
            for(int i = from; i < to; i++ ){
                if(number[i] > 100)count++;
            }
            return count;
        }
        else{
            int mid = from + (to - from) /2;
            MyRecursiveTask task1 = new MyRecursiveTask(number, from, mid);
            MyRecursiveTask task2 = new MyRecursiveTask(number, mid, to);
            invokeAll(task1,task2);
          return  task1.join() + task2.join();
        }
    }
}
