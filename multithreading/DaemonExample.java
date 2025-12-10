package multithreading;


/*
Interview-Ready Summary
- Daemon threads are background helpers that stop when all user threads finish.
- Inbuilt examples: Garbage Collector, Finalizer, JVM service threads.
- Use cases: monitoring, logging, cleanup, background services.
- Best practice: Never rely on daemon threads for critical work, since they can terminate abruptly when JVM exits.

 */




class BackgroundLogger implements Runnable
{

    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("Logging system status .....");
            try
            {
                Thread.sleep(500); // log every 500ms

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


public class DaemonExample {

    public static void main(String[] args) {
        Thread logger = new Thread(new BackgroundLogger());  // NEW

        logger.setDaemon(true); // mark as daemon
        logger.start();  // RUNNING OR RUNNABLE (it will execute as it gets system availiable)


        System.out.println("Main thread running ..... ");

        try
        {
            Thread.sleep(2000); // simulate main work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished " + Thread.currentThread().getName());


    }
}
