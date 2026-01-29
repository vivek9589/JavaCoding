package multithreading;

/*
🔍 Problem: Race Condition
When multiple threads increment a shared counter without synchronization, updates can overlap and the final result is less than expected.





Interview-Ready Explanation
- Race condition occurs when multiple threads access and modify shared data simultaneously without proper synchronization.
- Increments (count++) are not atomic — they involve read, increment, and write steps.
- Threads interleave these steps, causing lost updates.
- Fix: use synchronized, AtomicInteger, or ReentrantLock.

 */

class Counter
{
    private  int count = 0;

    public synchronized void increment()
    {
       // System.out.println("Current count : "+ count);
        count++;
    }

    public int getCount()
    {
        return count;
    }
}
public class SynchronizedCounterDemo {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Runnable task = () -> {
            for(int i = 0;i <50000;i++)
            {
                counter.increment();
            }

        };

        Thread t0 = new Thread(task);
        Thread t1 = new Thread(task);


        t0.start();
        t1.start();



        t0.join();
        t1.join();



        System.out.println("Final count : " + counter.getCount());





    }





}
