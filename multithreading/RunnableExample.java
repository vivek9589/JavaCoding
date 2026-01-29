package multithreading;

class MyRunnable implements Runnable
{
    @Override
    public void run() {
        System.out.println("Thread running via Runnable " + Thread.currentThread().getName());
    }
}




public class RunnableExample {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());   /*Thread t2 = new Thread(new MyRunnable());
                                                        - Here you wrap a Runnable object inside a Thread.
                                                        - The Thread constructor accepts a Runnable and, when you call t2.start(), it executes the run() method of that Runnable.
                                                        - This is the actual thread of execution.

                                                        */








        t1.start();
        t2.start();



        System.out.println(t1.getName());
        System.out.println(t2.getName());








    }
}
