package online.dars.lesson4.src.task5;


import java.util.UUID;
import java.util.concurrent.*;

public class Task5 {
    private final static ThreadLocalRandom random = ThreadLocalRandom.current();
    private final static ThreadLocal<User> userThreadLocal = new ThreadLocal<>(){
        @Override
        public User get() {
            return new User(UUID.randomUUID().toString(),random.nextInt(1,100));
        }
    };
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ThreadLocalRandom age = ThreadLocalRandom.current();
        Runnable runnable = ()->{
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(userThreadLocal.get());
        };
        for(int i = 0; i < 10; i++){
          executorService.execute(runnable);
        }
        executorService.shutdown();
    }
}


class User{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
