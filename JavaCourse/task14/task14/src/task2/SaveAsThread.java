package task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveAsThread extends Thread {

    private final int[] array;
    private final File file;

    public SaveAsThread(int[] array, File file) {
        this.array = array;
        this.file = file;
    }

    public void run() {
        synchronized (file) {
            try {
                try (FileWriter fos = new FileWriter(file, true)) {
                    for (int j : array) {
                        try {
                            fos.write(j);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
