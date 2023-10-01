import task1.MaxInArrayThread;
import task1.MinInArrayThread;
import task2.SaveAsThread;
import task3.Generator;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        int[] array = ArrayGenerator.generateArray(20);
        MaxInArrayThread maxInArrayThread = new MaxInArrayThread(array);
        MinInArrayThread minInArrayThread = new MinInArrayThread(array);
        minInArrayThread.start();
        maxInArrayThread.start();

        int[] array1 = ArrayGenerator.generateArray(5, 1, 50);
        int[] array2 = ArrayGenerator.generateArray(6, 1, 50);
        int[] array3 = ArrayGenerator.generateArray(7, 1, 50);

        File file = new File("file.txt");

        SaveAsThread thread1 = new SaveAsThread(array1, file);
        SaveAsThread thread2 = new SaveAsThread(array2, file);
        SaveAsThread thread3 = new SaveAsThread(array3, file);
        thread3.start();
        thread1.start();
        thread2.start();

        Generator generator = new Generator();
        generator.start();
    }
}