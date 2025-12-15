package multithreading.executorframework;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BasicExecutorDemo {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable task1 = () -> System.out.println("Task 1 Executed");
        Runnable task2 = () -> System.out.println("Task 2 Executed");

        Runnable task3 = () -> System.out.println("Task 3 Executed");
        Runnable task4 = () -> System.out.println("Task 4 Executed");



        executor.submit(task1);
        executor.submit(task2);

        executor.submit(task3);
        executor.submit(task4);

        executor.shutdown();








    }
}
