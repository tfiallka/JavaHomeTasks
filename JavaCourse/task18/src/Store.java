import java.util.concurrent.Semaphore;

public class Store {
    int item;
    static Semaphore semConsumer = new Semaphore(0);
    static Semaphore semProducer = new Semaphore(1);

    void get() {
        try {
            semConsumer.acquire();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        System.out.println("Consumer consumed item : " + item);
        semProducer.release();
    }

    void put(int item) {
        try {
            semProducer.acquire();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        this.item = item;
        System.out.println("Producer produced item : " + item);
        semConsumer.release();
    }
}

