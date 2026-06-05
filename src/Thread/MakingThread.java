package Thread;

class Hii extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hii");
            try{
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

        }
    }
}

class Hello extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class MakingThread {
    public static void main(String[]a){
        Hii h = new Hii();
        Hello he = new Hello();
        h.start();
        try{
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        he.start();
    }
}
