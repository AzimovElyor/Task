package online.dars.lesson1.task2;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = ()-> {
            for(int i = 0; i < 100; i++){
                System.out.println(Thread.currentThread().getName() + "-> " + i);
            }
        };
        new Thread(runnable, "Thread 1").start();
        System.out.println("Hello world");
    }
}
