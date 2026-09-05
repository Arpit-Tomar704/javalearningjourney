package chap26_MultiThreading.Threadclass;

public class NeedOfMultiThreading {
    static void main(String[] args) {
       long startime = System.currentTimeMillis();

        //first task
        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d* ",i);

        }
        System.out.println("\n *First task complete");


        //second task
        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d$ ",i);

        }
        System.out.println("\n $ task complete");
        //third task

        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d# ",i);

        }
        System.out.println("\n # task complete");

        //fourth task

        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d& ",i);

        }
        System.out.println("\n & task complete");

       long endtime = System.currentTimeMillis();
        System.out.printf("total time taken: %d ",(endtime-startime));











    }
}
