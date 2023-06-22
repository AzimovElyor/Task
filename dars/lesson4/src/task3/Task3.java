package task3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.concurrent.*;

public class Task3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        ArrayList<Future<String>> futures = new ArrayList<>();
        Callable<String> callable = ()-> {
            Thread.sleep(100);
            return LocalDateTime.now().toString();
        };
        for(int i = 0; i < 100; i++){
           futures.add(service.submit(callable));
        }
        Thread.sleep(2000);
        int count = 0;
        for (Future<String> future : futures) {
            if(future.isDone()) {
                count++;
                System.out.println(future.get());
            }
        }
        System.out.println(count);
    }
}
