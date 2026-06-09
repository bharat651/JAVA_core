package Thread;

// TODO: Define PrinterTask class that implements Runnable
class PrinterTask implements Runnable{
    public void run(){
        for(int i = 1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+":Running task "+i);
        }
    }
}

public class Exercise {
    public static void main(String[] args)throws InterruptedException {
        // TODO: Create a single PrinterTask object
        PrinterTask pt = new PrinterTask();

        // TODO: Create two threads using the same task
        // Name them "Worker-1" and "Worker-2"
        Thread Worker1 = new Thread(pt,"Worker-1");
        Thread Worker2 = new Thread(pt,"Worker-2");

        // TODO: Start both thread
        Worker1.start();
        Worker2.start();

        // TODO: Use join() to wait for both threads to finish

        Worker1.join();
        Worker2.join();
    }
}

