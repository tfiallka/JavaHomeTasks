import task1.MaxInArrayThread;
import task1.MinInArrayThread;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = ArrayGenerator.generateArray(20);
        System.out.println(Arrays.toString(array));
        MaxInArrayThread maxInArrayThread = new MaxInArrayThread(array);
        MinInArrayThread minInArrayThread = new MinInArrayThread(array);
        minInArrayThread.start();
        maxInArrayThread.start();
    }
}