package online.dars.lesson2.task4;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        Bancomat bancomat = new Bancomat();
        Runnable runnable = ()->{
            for(int i = 0; i < 1000; i++){
                bancomat.transfer(10_000);
            }
            System.out.println(Thread.currentThread().getName()  + " is end" );

        };
        for(int i = 0; i < 10; i++){
            new Thread(runnable).start();
        }
        long sum = 10_000 * 1000 * 10;
        Thread.sleep(4000);
        System.out.println(bancomat.getAmount());
        if(999999999 - sum == bancomat.getAmount() ){
            System.out.println("Very nice");
        }
        else System.out.println("Race condition");
    }
}
class Bancomat{
    private long amount = 999999999;
    public synchronized void transfer(long money){
        setAmount(getAmount()-money);
    }
    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
