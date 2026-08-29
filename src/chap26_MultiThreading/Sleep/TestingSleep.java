package chap26_MultiThreading.Sleep;

public class TestingSleep {
    static void main(String[] args) throws  InterruptedException {
        System.out.println("Before Sleeping");
        Thread.sleep(10000);
        System.out.println("woke up");
        Thread.yield();
        

    }
}
