package online.dars.lesson3.task4;

import java.sql.Time;
import java.util.Random;
import java.util.UUID;

public class Task4 {
    public static void main(String[] args) throws InterruptedException{
        UserRepository userRepository = UserRepository.getInstance();
        Runnable runnable = () -> {
                User user = new User(UUID.randomUUID(), "sxdcfghjkl;", new Random().nextInt(10, 100000));
                userRepository.add(user);

            System.out.println(Thread.currentThread().getName() + " is end ");
        };
        for(int i = 0; i < 1000; i++){
            new Thread(runnable).start();
        }
        Thread.sleep(2000);
        System.out.println(userRepository.getAll().size());

    }
}


