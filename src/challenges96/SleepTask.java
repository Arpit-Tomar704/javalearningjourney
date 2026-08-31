package challenges96;

public class SleepTask  implements  Runnable{
    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.printf("Current thread is %s\n",current.getName());
        try {
            Thread.sleep(getrandom()*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Ended with  thread:  %s\n",current.getName());
    }

    private int getrandom(){
        double random = Math.random() *5+1;
        return (int) random;

    }
}
