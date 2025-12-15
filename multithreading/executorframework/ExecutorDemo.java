package multithreading.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



/*

The Java Executor Framework is a high-level concurrency API that simplifies thread management by providing
reusable thread pools and execution policies. Instead of manually creating and managing threads,
 you submit tasks (Runnable or Callable) to an executor, which handles scheduling, execution, and lifecycle.



🚀 Best Practices
- Always shutdown executors to release resources.
- Use Callable + Future for tasks that return results.
- Prefer CompletableFuture for asynchronous pipelines.
- Tune ThreadPoolExecutor parameters (core size, max size, queue type) for performance.

Why Use the Executor Framework
- Avoid manual thread creation: Creating threads directly is error-prone and resource-heavy.
- Thread reuse: Executors maintain pools of threads, reducing overhead.
- Task abstraction: Focus on the logic of tasks, not thread mechanics.
- Scalability: Executors handle queuing, scheduling, and load distribution automatically.
- Flexibility: Different executor types suit different workload


 Core Components
- Executor (interface): Root interface for task execution.
- ExecutorService: Extends Executor, adds lifecycle management (shutdown(), awaitTermination()).
- ThreadPoolExecutor: Core implementation with customizable pool size, queue, and policies.
- ScheduledExecutorService: Supports delayed and periodic task execution.
- Executors (utility class): Factory methods to create common executor



 */



public class ExecutorDemo {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i=1;i<=5;i++)
        {
            int taskId = i;
            executor.submit(()-> {
                System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();

    }



}
