package multithreading;

import java.util.concurrent.*;

public class SubmitCallableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        // callable functional interface , it's similar to Runnable functional interface ,
        // Use Callable when u want to return something(Future<?>)

        Callable<Integer> task = ()-> {
            Thread.sleep(500);
            return 42;
        };

        Future<Integer> future = executor.submit(task);
        System.out.println("Result " + future.get());

        executor.shutdown();


    }
}
