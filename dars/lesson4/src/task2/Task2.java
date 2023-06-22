package task2;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Task2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        System.out.println("Hello world");
        runnable(executorService);
        Future<String> callable = callable(executorService);
        System.out.println(callable.get() + "future");
        System.out.println("Hello PDP");
    }

    private static Future<String> callable(ExecutorService executorService) {
        System.out.println("-------------Callable-----------------");
        return executorService.submit(() -> LocalDateTime.now().toString());
    }

    private static void runnable(ExecutorService executors) {
        System.out.println("------------------Runnable-------------");
        Runnable runnable = ()->{
            for(int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread());
                System.out.println(LocalDateTime.now());
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        executors.execute(runnable);
    }
}
