package online.dars.lesson1.task3;

public class Task {
    public static void main(String[] args)  {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getName() + "-> " + i);
            }
        }, "Thread 1");
        thread.start();

        System.out.println("Hello PDP");

    }
}
