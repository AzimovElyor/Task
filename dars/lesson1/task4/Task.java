package online.dars.lesson1.task4;

public class Task {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getName() + "-> " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                }
            }
        }, "Thread 1");
        thread.start();

        System.out.println("Hello PDP");
    }
}
