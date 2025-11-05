public class ExtendsThread {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start();

    }
}

class Mythread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Running step :" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}
