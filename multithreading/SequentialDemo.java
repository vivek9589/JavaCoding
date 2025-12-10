package multithreading;

class FileDownload
{
    private String fileName;

    public FileDownload(String fileName)
    {
        this.fileName =  fileName;
    }

    public void download()
    {
        System.out.println("Downloading "+ fileName + "started....");

        try{
            Thread.sleep(3000);  // simulate time-consuming task
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Downloading "+ fileName + "completed !");

    }
}


public class SequentialDemo {
    public static void main(String[] args) {

        FileDownload f1 = new FileDownload("file1.zip");
        FileDownload f2 = new FileDownload("file2.zip");


        // sequential execution
        f1.download();
        f2.download();
    }
}
