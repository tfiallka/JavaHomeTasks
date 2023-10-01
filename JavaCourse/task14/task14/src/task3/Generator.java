package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator extends Thread {
    private final List<Integer> list = new ArrayList<>();

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt());
            try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
