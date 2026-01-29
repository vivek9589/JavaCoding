package multithreading;

public class LambdaThreadExample {

    public static void main(String[] args) {



        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread(()-> System.out.println("Thread via Lambda : " + Thread.currentThread().getName()));
        Thread t2 = new Thread(()-> System.out.println("Another Lambda Thread : " + Thread.currentThread().getName()));

        t1.start();
        t2.start();



    }


}
