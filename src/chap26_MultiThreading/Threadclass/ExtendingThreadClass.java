package chap26_MultiThreading.Threadclass;

public class ExtendingThreadClass {
    static void main(String[] args) {
        long startime = System.currentTimeMillis();
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();


        System.out.println("\nstarting the first thread ");
        t1.start();
        System.out.println("\nstarting the second thread ");
        t2.start();
        System.out.println("\nstarting the third thread ");
        t3.start();




        long endtime = System.currentTimeMillis();
        System.out.printf("%s total time taken: %d ",
                Thread.currentThread().getName()
                ,(endtime-startime));











    }
}
