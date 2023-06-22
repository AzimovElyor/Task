package online.dars.lesson2.task7;

public class Task7 {
    public static void main(String[] args) throws InterruptedException {
        ProblemFieldVisibility visibility = new ProblemFieldVisibility();
        Runnable runnable = visibility::run;
          for(int i = 0; i < 5; i++){
              new Thread(runnable).start();
          }

        Thread.sleep(5000);
        visibility.stop();

    }
}
class ProblemFieldVisibility{
    private volatile    boolean a;

    public void run(){
        a = true;
        while (a){
        }
        System.out.println(Thread.currentThread().getName() + "::::::::::: is FINISHED");
    }
    public void stop(){
        a = false;
    }
}

