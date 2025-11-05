public class ImplementsRunnable {
    public static void main(String[] args) {
        MyThreads myThreads = new MyThreads();
        Thread thread = new Thread(myThreads);
        thread.start();
    }
}

class MyThreads implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}
