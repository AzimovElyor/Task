package online.dars.lesson2.task1;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable = ()->{
            for(int i = 0; i < 100; i++){
                counter.counter();
            }
            System.out.println(Thread.currentThread());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        };
        for(int i = 0; i < 10; i++ ){
            new Thread(runnable).start();
        }
        Thread.sleep(3000);
        System.out.println(counter.getSum());


    }
}
class Counter{
    private int sum = 0;
   public void counter(){
       setSum(getSum() + 1);
   }
    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
