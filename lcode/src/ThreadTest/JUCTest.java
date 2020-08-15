package ThreadTest;

public class JUCTest {
   public static class AtomicDemo implements Runnable{
        private int serialNumber = 0;

        public void run(){

            try{
                Thread.sleep(200);
            }catch(InterruptedException e){

            }

            System.out.println(Thread.currentThread().getName() + ":" + getSerialNumber());
        }

        public int getSerialNumber(){
            return serialNumber++;
        }
    }
        public static void main(String[] args){

            AtomicDemo ad = new AtomicDemo();

            for(int i=0; i < 10; i++){
                new Thread(ad).start();
            }

    }
}
