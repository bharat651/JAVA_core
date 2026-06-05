package Thread;
public class RunnableVsThread {
    public static void main(String[]args){
        Runnable a = () -> {
                for(int i = 0;i<10;i++){
                    System.out.println("Hii");
                    try{Thread.sleep(10);} catch(InterruptedException e){System.out.println(e.getMessage());}
                }
        };
        Runnable b = () -> {
            for(int i = 0;i<10;i++){
                System.out.println("Hii");
                try{Thread.sleep(10);} catch(InterruptedException e){System.out.println(e.getMessage());}
            }
        };
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
    }
}
