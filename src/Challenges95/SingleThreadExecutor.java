package Challenges95;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        PrintNumbers numbers = new PrintNumbers();
        service.submit(numbers);

       service.shutdown();//agr shutdown likhna bhoo jao to sourround by
        // try resource add kr dena executor thread me .
    }
}
