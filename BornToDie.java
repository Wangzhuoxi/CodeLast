public class BornToDie {
    public static class MyThread implements Runnable {
        public void run() {
            for (int i = 0; i < 10000; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.start();    //启动子线程
        //主线程继续同时向下执行
        System.out.println("主线程在呢宝贝");
        return;


    }
}
