package online.dars.lesson1.task6;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " -> " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        }, "Thread 1");

      thread.setDaemon(true);
        thread.start();
       Thread.sleep(300);
        System.out.println("hello world");
        System.out.println("Hello pdp");


    }
}
