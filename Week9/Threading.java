import java.util.Random;

class Thread1 implements Runnable {
    Random rand = new Random();
    boolean exit = false;

    public void run() {
        for (int i = 0; i < 2; i++) {
            int upperbound = 10;
            int value = rand.nextInt(upperbound);
            if (value % 2 == 0) {
                Thread2 ob1 = new Thread2(value);
                Thread t1 = new Thread(ob1);
                t1.start();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            } else {
                Thread3 ob2 = new Thread3(value);
                Thread t2 = new Thread(ob2);
                t2.start();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class Thread2 implements Runnable {
    int value;

    Thread2(int value) {
        this.value = value;
    }

    public void run() {
        System.out.println("Thread-2:" + value * value);
    }
}

class Thread3 implements Runnable {
    int value;

    Thread3(int value) {
        this.value = value;
    }

    public void run() {
        System.out.println("Thread-3:" + value * value * value);
    }
}

public class Threading {
    public static void main(String args[]) {
        Thread1 ob = new Thread1();
        Thread t = new Thread(ob);
        t.start();
    }
}
