package multithreading;
/*
Key Idea
- User threads: keep the JVM alive until they finish.
- Daemon threads: background helpers (like garbage collector). JVM exits once all user threads finish, even if daemon threads are still running.


             Interview-Ready Summary
- User threads keep JVM alive.
- Daemon threads die when all user threads finish.
- Use daemon threads for background tasks (logging, monitoring, cleanup).
- Never rely on daemon threads for critical work — they may terminate abruptly.

 */

class DaemonTask implements Runnable
{


    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("Daemon thread running in " + Thread.currentThread().getName());

            try{
                Thread.sleep(200);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

/*
 Expected Behavior
- Daemon thread prints every 200ms.
- After ~1 second, the main thread finishes.
- JVM terminates → daemon thread is killed immediately.
Sample output:

 */

public class DaemonDemo {

    public static void main(String[] args) {
        Thread daemonThread = new Thread(new DaemonTask());

        daemonThread.setDaemon(true);       /*
                                                     “What happens if you don’t set setDaemon(true) in this example?” → The answer: the thread becomes a user thread, and JVM will wait for it to finish, so the program won’t exit after 1 second.

                                                */
        daemonThread.start();

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Main thread finished!");
        // JVM exits here → daemon thread also stops automatically
    }
}
