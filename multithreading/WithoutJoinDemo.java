package multithreading;

/*
What is join()?
- join() tells the calling thread (usually main) to wait until another thread finishes before continuing.
- It’s a way to enforce ordering between threads.
- Without join(), threads run concurrently and finish in unpredictable order.


Key Points for Interviews
- Without join() → threads run concurrently, order is not guaranteed.
- With join() → you can enforce sequential execution (like waiting for Task1 before Task2).
- Use case: When one thread’s result is needed before starting another (e.g., load data → process data → save data).
- Best practice: In scalable systems, instead of chaining join(), use ExecutorService + Future.get() for cleaner control.



 */

class MyTask extends Thread
{
    private String taskName;

    public MyTask(String taskName)
    {
        this.taskName = taskName;
    }

    @Override
    public void run()
    {
        System.out.println(taskName + " started in " + Thread.currentThread().getName());
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(taskName + " finished in " + Thread.currentThread().getName());

    }


}

/*

public class WithoutJoinDemo {



    // WithoutJoinDemo
    public static void main(String[] args) {


            System.out.println("Without join() , Order will be unpredictable , ");


        System.out.println("main thread start : " + Thread.currentThread().getName());

        MyTask t0 = new MyTask("Task0");
        MyTask t1 = new MyTask("Task1");
        MyTask t2 = new MyTask("Task2");


        t0.start();
        t1.start();
        t2.start();


        System.out.println("main thread finished : " + Thread.currentThread().getName());

    }
}

*/


class WithjoinDemo
{
    public static void main(String[] args) {

        System.out.println("With join() it enforece predicatable ordered manner");

        MyTask t0 = new MyTask("Task0");
        MyTask t1 = new MyTask("Task1");
        MyTask t2 = new MyTask("Task2");


        t0.start();
        try{
            t0.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        t1.start();
        try{
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t2.start();
        try{
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main thread finished after all tasks!");

        /*
        "join() is used to make one thread wait until another finishes. Without it, thread execution order is unpredictable.
         With it, you can enforce ordering and synchronization between threads.

         */

        System.out.println("\"join() is used to make one thread wait until another finishes. Without it, thread execution order is unpredictable. With it, you can enforce ordering and synchronization between threads.\n");





    }
}