package chap26_MultiThreading.Join;

import chap26_MultiThreading.runnable.PrintTask;

public class TestingJoin {
    static void main(String[] args )throws InterruptedException {
        long startime = System.currentTimeMillis();

        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');


        Thread t1 = new Thread(p1);
        t1.start();
        System.out.println("\nThread 1 started ");
        Thread t2 = new Thread(p2);
        t2.start();
        System.out.println("\nThread 2 started ");
        t1.join();
        Thread t3 = new Thread(p3);
        t3.start();

        long endtime = System.currentTimeMillis();
        System.out.printf("%s total time taken: %d ",
                Thread.currentThread().getName()
                ,(endtime-startime));








    }






}
