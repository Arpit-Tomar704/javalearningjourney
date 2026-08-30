package chap27_Executer.Futures;

import java.util.concurrent.*;

public class TestingFutures {
    static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        FetchName  task1 = new FetchName("Ansh");
        FetchName  task2 = new FetchName("harsh ");
        FetchName task3 = new FetchName("arsh");

        Future<String>  name1 = service.submit(task1);
        Future<String>  name2 = service.submit(task2);
        Future<String>  name3 = service.submit(task3);

        System.out.printf("\nfull name is:  %s", name1.get());
        System.out.printf("\nfull name is:  %s", name2.get());
        System.out.printf("\nfull name is:  %s", name3.get());

        service.shutdown();




    }
}
