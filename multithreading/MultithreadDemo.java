package multithreading;



/*
Why Multithreading?
Multithreading allows a program to perform multiple tasks concurrently instead of sequentially.
This is crucial when:
• 	Tasks are independent (e.g., downloading files, processing data).
• 	You want to utilize CPU cores better.



 Comparison
                - Runnable version:
- Task logic is reusable.
- Works seamlessly with ExecutorService and thread pools.
- Your class can still extend another class.
- Cleaner separation of concerns.


            - Thread version:
- Task logic is tied directly to the thread class.
- Less flexible (no multiple inheritance).
- Harder to reuse with modern concurrency frameworks.

 */

class FileDownloadTask implements Runnable
{
    private String fileName;

    public FileDownloadTask(String fileName)
    {
        this.fileName = fileName;
    }



    @Override
    public void run() {
        System.out.println("Downloding "+ fileName + " started in " + Thread.currentThread().getName());

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Downloading  "+ fileName + "completed" + Thread.currentThread().getName());


    }
}


public class MultithreadDemo {

    public static void main(String[] args) {

        Thread t1 = new Thread(new FileDownloadTask("file1.zip"));
        Thread t2 = new Thread(new FileDownloadTask("file2.zip"));
        Thread t3 = new Thread(new FileDownloadTask("file3.zip"));



        t1.start();
        t2.start();
        t3.start();


    }


}
