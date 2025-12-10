package multithreading;

class MyThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread is running via MyThread class");
    }

}
/*
- Here, run() contains the task logic.
- start() creates a new thread and calls run() internally.
- Extending Thread is simple but less flexible (you can’t extend another class).

 */


public class CreateThread{

    public static void main(String[] args) {

        CreateThread tt = new CreateThread();

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

       // t1.start();
       // t2.start();


        System.out.println(t1.getName());
        System.out.println(t2.getName());








    }
}
