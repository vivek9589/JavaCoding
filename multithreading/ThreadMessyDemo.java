package multithreading;

// Each subclass duplicates similar logic
class FileProcessor extends Thread {
    private String fileName;

    public FileProcessor(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Processing file: " + fileName + " in " + Thread.currentThread().getName());
    }

}



public class ThreadMessyDemo {
    public static void main(String[] args) {
        FileProcessor t1 = new FileProcessor("data1.txt");
        FileProcessor t2 = new FileProcessor("data2.txt");
        FileProcessor t3 = new FileProcessor("data3.txt");

        t1.start();
        t2.start();
        t3.start();
    }

}
