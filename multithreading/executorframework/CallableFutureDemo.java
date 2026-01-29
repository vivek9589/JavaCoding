package multithreading.executorframework;

import java.util.concurrent.*;

public class CallableFutureDemo {

    public static void main(String[] args) throws Exception {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ScheduledExecutorService

        Callable<Integer> task = () -> {
            Thread.sleep(500);
            return 42;
        };


        Future<Integer> future = executorService.submit(task);
        System.out.println("Waiting for result ....");

        System.out.println("Result : " + future.get());

        executorService.shutdown();


    }
}
